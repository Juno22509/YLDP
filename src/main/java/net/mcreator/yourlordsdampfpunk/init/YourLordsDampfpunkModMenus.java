
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yourlordsdampfpunk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.yourlordsdampfpunk.world.inventory.TinkerInterfaceMenu;
import net.mcreator.yourlordsdampfpunk.YourLordsDampfpunkMod;

public class YourLordsDampfpunkModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, YourLordsDampfpunkMod.MODID);
	public static final RegistryObject<MenuType<TinkerInterfaceMenu>> TINKER_INTERFACE = REGISTRY.register("tinker_interface", () -> IForgeMenuType.create(TinkerInterfaceMenu::new));
}
