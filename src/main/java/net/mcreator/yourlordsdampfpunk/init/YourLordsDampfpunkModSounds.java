
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yourlordsdampfpunk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.yourlordsdampfpunk.YourLordsDampfpunkMod;

public class YourLordsDampfpunkModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, YourLordsDampfpunkMod.MODID);
	public static final RegistryObject<SoundEvent> BOLTERSOUND = REGISTRY.register("boltersound", () -> new SoundEvent(new ResourceLocation("your_lords_dampfpunk", "boltersound")));
}
