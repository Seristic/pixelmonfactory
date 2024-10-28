package com.seristic.pixelmonfactory.common.fluid;

import com.seristic.pixelmonfactory.PixelmonFactory;
import com.seristic.pixelmonfactory.common.block.ModBlock;
import com.seristic.pixelmonfactory.common.item.ModItem;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, PixelmonFactory.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_BLUE_BERRY_JUICE = FLUIDS.register("blue_berry_juice", () -> new ForgeFlowingFluid.Source(ModFluids.BLUE_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BLUE_BERRY_JUICE = FLUIDS.register("flowing_blue_berry_juice", () -> new ForgeFlowingFluid.Flowing(ModFluids.BLUE_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOURCE_GREEN_BERRY_JUICE = FLUIDS.register("green_berry_juice", () -> new ForgeFlowingFluid.Source(ModFluids.GREEN_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_GREEN_BERRY_JUICE = FLUIDS.register("flowing_green_berry_juice", () -> new ForgeFlowingFluid.Flowing(ModFluids.GREEN_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOURCE_PINK_BERRY_JUICE = FLUIDS.register("pink_berry_juice", () -> new ForgeFlowingFluid.Source(ModFluids.PINK_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PINK_BERRY_JUICE = FLUIDS.register("flowing_pink_berry_juice", () -> new ForgeFlowingFluid.Flowing(ModFluids.PINK_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOURCE_PURPLE_BERRY_JUICE = FLUIDS.register("purple_berry_juice", () -> new ForgeFlowingFluid.Source(ModFluids.PURPLE_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PURPLE_BERRY_JUICE = FLUIDS.register("flowing_purple_berry_juice", () -> new ForgeFlowingFluid.Flowing(ModFluids.PURPLE_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOURCE_RED_BERRY_JUICE = FLUIDS.register("red_berry_juice", () -> new ForgeFlowingFluid.Source(ModFluids.RED_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_RED_BERRY_JUICE = FLUIDS.register("flowing_red_berry_juice", () -> new ForgeFlowingFluid.Flowing(ModFluids.RED_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOURCE_YELLOW_BERRY_JUICE = FLUIDS.register("yellow_berry_juice", () -> new ForgeFlowingFluid.Source(ModFluids.YELLOW_BERRY_JUICE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_YELLOW_BERRY_JUICE = FLUIDS.register("flowing_yellow_berry_juice", () -> new ForgeFlowingFluid.Flowing(ModFluids.YELLOW_BERRY_JUICE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties GREEN_BERRY_JUICE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.GREEN_JUICE_FLUID_TYPE, SOURCE_GREEN_BERRY_JUICE, FLOWING_GREEN_BERRY_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlock.GREEN_BERRY_JUICE_FLUID_BLOCK)
            .bucket(ModItem.GREEN_BERRY_JUICE_BUCKET);

    public static final ForgeFlowingFluid.Properties BLUE_BERRY_JUICE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.BLUE_BERRY_JUICE_FLUID_TYPE, SOURCE_BLUE_BERRY_JUICE, FLOWING_BLUE_BERRY_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlock.BLUE_BERRY_JUICE_FLUID_BLOCK)
            .bucket(ModItem.BLUE_BERRY_JUICE_BUCKET);

    public static final ForgeFlowingFluid.Properties PINK_BERRY_JUICE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.PINK_JUICE_FLUID_TYPE, SOURCE_PINK_BERRY_JUICE, FLOWING_PINK_BERRY_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlock.PINK_BERRY_JUICE_FLUID_BLOCK)
            .bucket(ModItem.PINK_BERRY_JUICE_BUCKET);

    public static final ForgeFlowingFluid.Properties PURPLE_BERRY_JUICE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.PURPLE_JUICE_FLUID_TYPE, SOURCE_PURPLE_BERRY_JUICE, FLOWING_PURPLE_BERRY_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlock.PURPLE_BERRY_JUICE_FLUID_BLOCK)
            .bucket(ModItem.PURPLE_BERRY_JUICE_BUCKET);

    public static final ForgeFlowingFluid.Properties RED_BERRY_JUICE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.RED_JUICE_FLUID_TYPE, SOURCE_RED_BERRY_JUICE, FLOWING_RED_BERRY_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlock.RED_BERRY_JUICE_FLUID_BLOCK)
            .bucket(ModItem.RED_BERRY_JUICE_BUCKET);

    public static final ForgeFlowingFluid.Properties YELLOW_BERRY_JUICE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.YELLOW_JUICE_FLUID_TYPE, SOURCE_YELLOW_BERRY_JUICE, FLOWING_YELLOW_BERRY_JUICE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlock.YELLOW_BERRY_JUICE_FLUID_BLOCK)
            .bucket(ModItem.YELLOW_BERRY_JUICE_BUCKET);
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}