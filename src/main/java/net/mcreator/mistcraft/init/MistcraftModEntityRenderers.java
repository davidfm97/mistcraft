
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mistcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mistcraft.client.renderer.LordRulerRenderer;
import net.mcreator.mistcraft.client.renderer.InquisitorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MistcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MistcraftModEntities.INQUISITOR.get(), InquisitorRenderer::new);
		event.registerEntityRenderer(MistcraftModEntities.LORD_RULER.get(), LordRulerRenderer::new);
	}
}
