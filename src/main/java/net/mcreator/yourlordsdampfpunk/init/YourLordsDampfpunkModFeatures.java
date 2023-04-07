
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yourlordsdampfpunk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.yourlordsdampfpunk.world.features.ores.TinOreFeature;
import net.mcreator.yourlordsdampfpunk.YourLordsDampfpunkMod;

@Mod.EventBusSubscriber
public class YourLordsDampfpunkModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, YourLordsDampfpunkMod.MODID);
	public static final RegistryObject<Feature<?>> TIN_ORE = REGISTRY.register("tin_ore", TinOreFeature::feature);
}
