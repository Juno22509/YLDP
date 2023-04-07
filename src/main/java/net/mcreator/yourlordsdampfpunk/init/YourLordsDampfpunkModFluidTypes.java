
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yourlordsdampfpunk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.yourlordsdampfpunk.fluid.types.SoulBloodFluidType;
import net.mcreator.yourlordsdampfpunk.YourLordsDampfpunkMod;

public class YourLordsDampfpunkModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, YourLordsDampfpunkMod.MODID);
	public static final RegistryObject<FluidType> SOUL_BLOOD_TYPE = REGISTRY.register("soul_blood", () -> new SoulBloodFluidType());
}
