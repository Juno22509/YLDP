
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yourlordsdampfpunk.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.yourlordsdampfpunk.client.renderer.BolterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YourLordsDampfpunkModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(YourLordsDampfpunkModEntities.BOLTER.get(), BolterRenderer::new);
	}
}
