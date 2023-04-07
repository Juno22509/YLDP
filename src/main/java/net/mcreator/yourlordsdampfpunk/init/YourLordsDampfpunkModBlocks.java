
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yourlordsdampfpunk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.yourlordsdampfpunk.block.TinkerTableBlock;
import net.mcreator.yourlordsdampfpunk.block.TinOreBlock;
import net.mcreator.yourlordsdampfpunk.block.TinBlockBlock;
import net.mcreator.yourlordsdampfpunk.block.SteelBlockBlock;
import net.mcreator.yourlordsdampfpunk.block.SoulBloodBlock;
import net.mcreator.yourlordsdampfpunk.block.BrassBlockBlock;
import net.mcreator.yourlordsdampfpunk.YourLordsDampfpunkMod;

public class YourLordsDampfpunkModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, YourLordsDampfpunkMod.MODID);
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> TINKER_TABLE = REGISTRY.register("tinker_table", () -> new TinkerTableBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> BRASS_BLOCK = REGISTRY.register("brass_block", () -> new BrassBlockBlock());
	public static final RegistryObject<Block> SOUL_BLOOD = REGISTRY.register("soul_blood", () -> new SoulBloodBlock());
}
