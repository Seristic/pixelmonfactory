package com.seristic.pixelmonfactory.common.fluid;

import com.seristic.pixelmonfactory.PixelmonFactory;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PixelmonFactory.MOD_ID);

    public static final RegistryObject<FluidType> BLUE_BERRY_JUICE_FLUID_TYPE = registerFluidType("blue_berry_juice",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0x4B0082FF,
                    new Vector3f(0f / 255f, 78f / 255f, 153f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));

    public static final RegistryObject<FluidType> GREEN_JUICE_FLUID_TYPE = registerFluidType("green_berry_juice",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,0xA100FF00 ,
                    new Vector3f(0f / 255f, 255f / 255f, 0f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));

    public static final RegistryObject<FluidType> PINK_JUICE_FLUID_TYPE = registerFluidType("pink_berry_juice",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1FFDAB9,
                    new Vector3f(255f / 255f, 192f / 255f, 203f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));

    public static final RegistryObject<FluidType> PURPLE_JUICE_FLUID_TYPE = registerFluidType("purple_berry_juice",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1800080,
                    new Vector3f(128f / 255f, 0f / 255f, 128f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));

    public static final RegistryObject<FluidType> RED_JUICE_FLUID_TYPE = registerFluidType("red_berry_juice",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1E25858,
                    new Vector3f(226f / 255f, 88f / 255f, 88f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));

    public static final RegistryObject<FluidType> YELLOW_JUICE_FLUID_TYPE = registerFluidType("yellow_berry_juice",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1FFFF00,
                    new Vector3f(255f / 255f, 255f / 255f, 0f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));


    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}