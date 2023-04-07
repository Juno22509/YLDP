
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yourlordsdampfpunk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.yourlordsdampfpunk.fluid.SoulBloodFluid;
import net.mcreator.yourlordsdampfpunk.YourLordsDampfpunkMod;

public class YourLordsDampfpunkModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, YourLordsDampfpunkMod.MODID);
	public static final RegistryObject<FlowingFluid> SOUL_BLOOD = REGISTRY.register("soul_blood", () -> new SoulBloodFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SOUL_BLOOD = REGISTRY.register("flowing_soul_blood", () -> new SoulBloodFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SOUL_BLOOD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SOUL_BLOOD.get(), RenderType.translucent());
		}
	}
}
