package net.mcreator.yourlordsdampfpunk.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.yourlordsdampfpunk.world.inventory.TinkerInterfaceMenu;
import net.mcreator.yourlordsdampfpunk.network.TinkerInterfaceButtonMessage;
import net.mcreator.yourlordsdampfpunk.YourLordsDampfpunkMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TinkerInterfaceScreen extends AbstractContainerScreen<TinkerInterfaceMenu> {
	private final static HashMap<String, Object> guistate = TinkerInterfaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_tinker;

	public TinkerInterfaceScreen(TinkerInterfaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("your_lords_dampfpunk:textures/screens/tinker_interface.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("your_lords_dampfpunk:textures/screens/tinkertablearrow.png"));
		this.blit(ms, this.leftPos + 56, this.topPos + 26, 0, 0, 64, 32, 64, 32);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.your_lords_dampfpunk.tinker_interface.label_tinkering"), 9, 13, -7770816);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_tinker = new Button(this.leftPos + 59, this.topPos + 59, 56, 20, Component.translatable("gui.your_lords_dampfpunk.tinker_interface.button_tinker"), e -> {
			if (true) {
				YourLordsDampfpunkMod.PACKET_HANDLER.sendToServer(new TinkerInterfaceButtonMessage(0, x, y, z));
				TinkerInterfaceButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_tinker", button_tinker);
		this.addRenderableWidget(button_tinker);
	}
}
