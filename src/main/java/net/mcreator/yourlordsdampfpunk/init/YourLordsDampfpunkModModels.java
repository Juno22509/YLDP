
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yourlordsdampfpunk.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.yourlordsdampfpunk.client.model.ModelBolterBullet3d;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class YourLordsDampfpunkModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBolterBullet3d.LAYER_LOCATION, ModelBolterBullet3d::createBodyLayer);
	}
}
