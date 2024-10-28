package com.seristic.pixelmonfactory;

import com.pixelmonmod.pixelmon.api.config.api.yaml.YamlConfigFactory;
import com.seristic.pixelmonfactory.common.block.ModBlock;
import com.seristic.pixelmonfactory.common.fluid.ModFluidTypes;
import com.seristic.pixelmonfactory.common.fluid.ModFluids;
import com.seristic.pixelmonfactory.common.init.CreativeTabInit;
import com.seristic.pixelmonfactory.common.item.ModItem;
import com.seristic.pixelmonfactory.config.PixelmonFactoryConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.server.ServerStoppedEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.IOException;

@SuppressWarnings("ALL")
@Mod(PixelmonFactory.MOD_ID)
@Mod.EventBusSubscriber(modid = PixelmonFactory.MOD_ID)
public class PixelmonFactory {

    public static final String MOD_ID = "pixelmonfactory";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    private static PixelmonFactory instance;

    private PixelmonFactoryConfig config;

    public PixelmonFactory() {
        instance = this;

        reloadConfig();

        if (getConfig().getDebugMode()) {
            LOGGER.info("PIXELMONFACTORY DEBUGGER IS ENABLED! PLEASE ONLY HAVE THIS ON FOR TESTING PURPOSES. IF THIS IS ON AND YOU ARE HAVING ISSUES WITH PERFORMANCE PLEASE TURN THIS OFF FIRST BEFORE COMPLAINING.");
        }

        MinecraftForge.EVENT_BUS.register(this);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItem.register(eventBus);
        ModBlock.register(eventBus);
        ModFluidTypes.register(eventBus);
        ModFluids.register(eventBus);
        CreativeTabInit.TABS.register(eventBus);
    }

    @SubscribeEvent
    public static void onServerStarting(ServerStartingEvent event) {
        // Logic for when the server is starting here
    }

    public void reloadConfig() {
        try {
            this.config = YamlConfigFactory.getInstance(PixelmonFactoryConfig.class);
        } catch (IOException e) {
            LOGGER.error("Failed to load config", e);
        }
    }

    @SubscribeEvent
    public static void onServerStarted(ServerStartedEvent event) {
        // Logic for once the server has started here
    }

    @SubscribeEvent
    public static void onServerStopping(ServerStoppingEvent event) {
        // Logic for when the server is stopping
    }

    @SubscribeEvent
    public static void onServerStopped(ServerStoppedEvent event) {
        // Logic for when the server is stopped
    }

    public static PixelmonFactory getInstance() {
        return instance;
    }

    public static Logger getLogger() {
        return LOGGER;
    }

    public static PixelmonFactoryConfig getConfig() {
        return instance.config;
    }
}
