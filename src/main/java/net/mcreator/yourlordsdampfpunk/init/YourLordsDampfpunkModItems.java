
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yourlordsdampfpunk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.yourlordsdampfpunk.item.WoodenHandguardItem;
import net.mcreator.yourlordsdampfpunk.item.TinIngotItem;
import net.mcreator.yourlordsdampfpunk.item.SteelSwordItem;
import net.mcreator.yourlordsdampfpunk.item.SteelShovelItem;
import net.mcreator.yourlordsdampfpunk.item.SteelProjectileItem;
import net.mcreator.yourlordsdampfpunk.item.SteelPlateItem;
import net.mcreator.yourlordsdampfpunk.item.SteelPipeItem;
import net.mcreator.yourlordsdampfpunk.item.SteelPikeItem;
import net.mcreator.yourlordsdampfpunk.item.SteelPickaxeItem;
import net.mcreator.yourlordsdampfpunk.item.SteelIngotItem;
import net.mcreator.yourlordsdampfpunk.item.SteelHoeItem;
import net.mcreator.yourlordsdampfpunk.item.SteelAxeItem;
import net.mcreator.yourlordsdampfpunk.item.SoulBloodItem;
import net.mcreator.yourlordsdampfpunk.item.RawTinItem;
import net.mcreator.yourlordsdampfpunk.item.PrimingKitItem;
import net.mcreator.yourlordsdampfpunk.item.PlateMoldItem;
import net.mcreator.yourlordsdampfpunk.item.InfusedIronItem;
import net.mcreator.yourlordsdampfpunk.item.CharcoalLumpItem;
import net.mcreator.yourlordsdampfpunk.item.BulletCasingMoldItem;
import net.mcreator.yourlordsdampfpunk.item.BulletCasingItem;
import net.mcreator.yourlordsdampfpunk.item.BrassMixItem;
import net.mcreator.yourlordsdampfpunk.item.BrassIngotItem;
import net.mcreator.yourlordsdampfpunk.item.BolterItem;
import net.mcreator.yourlordsdampfpunk.item.BolterBulletItem;
import net.mcreator.yourlordsdampfpunk.YourLordsDampfpunkMod;

public class YourLordsDampfpunkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YourLordsDampfpunkMod.MODID);
	public static final RegistryObject<Item> STEEL_BLOCK = block(YourLordsDampfpunkModBlocks.STEEL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> CHARCOAL_LUMP = REGISTRY.register("charcoal_lump", () -> new CharcoalLumpItem());
	public static final RegistryObject<Item> INFUSED_IRON = REGISTRY.register("infused_iron", () -> new InfusedIronItem());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> TINKER_TABLE = block(YourLordsDampfpunkModBlocks.TINKER_TABLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_PLATE = REGISTRY.register("steel_plate", () -> new SteelPlateItem());
	public static final RegistryObject<Item> PLATE_MOLD = REGISTRY.register("plate_mold", () -> new PlateMoldItem());
	public static final RegistryObject<Item> TIN_ORE = block(YourLordsDampfpunkModBlocks.TIN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> TIN_BLOCK = block(YourLordsDampfpunkModBlocks.TIN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BRASS_MIX = REGISTRY.register("brass_mix", () -> new BrassMixItem());
	public static final RegistryObject<Item> BRASS_INGOT = REGISTRY.register("brass_ingot", () -> new BrassIngotItem());
	public static final RegistryObject<Item> BRASS_BLOCK = block(YourLordsDampfpunkModBlocks.BRASS_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_PIPE = REGISTRY.register("steel_pipe", () -> new SteelPipeItem());
	public static final RegistryObject<Item> STEEL_PIKE = REGISTRY.register("steel_pike", () -> new SteelPikeItem());
	public static final RegistryObject<Item> WOODEN_HANDGUARD = REGISTRY.register("wooden_handguard", () -> new WoodenHandguardItem());
	public static final RegistryObject<Item> BULLET_CASING_MOLD = REGISTRY.register("bullet_casing_mold", () -> new BulletCasingMoldItem());
	public static final RegistryObject<Item> BULLET_CASING = REGISTRY.register("bullet_casing", () -> new BulletCasingItem());
	public static final RegistryObject<Item> PRIMING_KIT = REGISTRY.register("priming_kit", () -> new PrimingKitItem());
	public static final RegistryObject<Item> STEEL_PROJECTILE = REGISTRY.register("steel_projectile", () -> new SteelProjectileItem());
	public static final RegistryObject<Item> BOLTER_BULLET = REGISTRY.register("bolter_bullet", () -> new BolterBulletItem());
	public static final RegistryObject<Item> BOLTER = REGISTRY.register("bolter", () -> new BolterItem());
	public static final RegistryObject<Item> SOUL_BLOOD_BUCKET = REGISTRY.register("soul_blood_bucket", () -> new SoulBloodItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
