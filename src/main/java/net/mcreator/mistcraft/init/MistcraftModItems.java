
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mistcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.mistcraft.MistcraftMod;

public class MistcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MistcraftMod.MODID);
	public static final RegistryObject<Item> INQUISITOR_SPAWN_EGG = REGISTRY.register("inquisitor_spawn_egg", () -> new ForgeSpawnEggItem(MistcraftModEntities.INQUISITOR, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LORD_RULER_SPAWN_EGG = REGISTRY.register("lord_ruler_spawn_egg", () -> new ForgeSpawnEggItem(MistcraftModEntities.LORD_RULER, -16777216, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
