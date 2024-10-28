package com.seristic.pixelmonfactory.config;

import com.pixelmonmod.pixelmon.api.config.api.data.ConfigPath;
import com.pixelmonmod.pixelmon.api.config.api.yaml.AbstractYamlConfig;
import info.pixelmon.repack.org.spongepowered.objectmapping.ConfigSerializable;

@ConfigSerializable
@ConfigPath("config/PixelmonFactory/config.yml")
public class PixelmonFactoryConfig extends AbstractYamlConfig {

    private boolean debugMode = false;

    public PixelmonFactoryConfig() {
        super();
    }

    public boolean getDebugMode() {
        return this.debugMode;

        // This does nothing as of right now so don't enable it.
    }
}
