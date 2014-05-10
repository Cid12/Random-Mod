package com.keepers.tharandommod.proxy;

import com.keepers.tharandommod.ThaRandomMod;
import com.keepers.tharandommod.entities.EntitySpikySnowball;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
        	RenderingRegistry.registerEntityRenderingHandler(EntitySpikySnowball.class, new RenderSnowball(ThaRandomMod.spikySnowball));
        }
        
}