
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mistcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mistcraft.entity.LordRulerEntity;
import net.mcreator.mistcraft.entity.InquisitorEntity;
import net.mcreator.mistcraft.MistcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MistcraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MistcraftMod.MODID);
	public static final RegistryObject<EntityType<InquisitorEntity>> INQUISITOR = register("inquisitor",
			EntityType.Builder.<InquisitorEntity>of(InquisitorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InquisitorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LordRulerEntity>> LORD_RULER = register("lord_ruler",
			EntityType.Builder.<LordRulerEntity>of(LordRulerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LordRulerEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			InquisitorEntity.init();
			LordRulerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(INQUISITOR.get(), InquisitorEntity.createAttributes().build());
		event.put(LORD_RULER.get(), LordRulerEntity.createAttributes().build());
	}
}
