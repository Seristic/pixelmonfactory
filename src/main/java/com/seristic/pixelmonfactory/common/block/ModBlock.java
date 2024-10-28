package com.seristic.pixelmonfactory.common.block;

import com.seristic.pixelmonfactory.PixelmonFactory;
import com.seristic.pixelmonfactory.common.fluid.ModFluids;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PixelmonFactory.MOD_ID);

    public static final RegistryObject<LiquidBlock> BLUE_BERRY_JUICE_FLUID_BLOCK = BLOCKS.register("blue_berry_juice_water_block", () -> new LiquidBlock(ModFluids.SOURCE_BLUE_BERRY_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> GREEN_BERRY_JUICE_FLUID_BLOCK = BLOCKS.register("green_berry_juice_water_block", () -> new LiquidBlock(ModFluids.SOURCE_GREEN_BERRY_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> PINK_BERRY_JUICE_FLUID_BLOCK = BLOCKS.register("pink_berry_juice_water_block", () -> new LiquidBlock(ModFluids.SOURCE_PINK_BERRY_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> PURPLE_BERRY_JUICE_FLUID_BLOCK = BLOCKS.register("purple_berry_juice_water_block", () -> new LiquidBlock(ModFluids.SOURCE_PURPLE_BERRY_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> RED_BERRY_JUICE_FLUID_BLOCK = BLOCKS.register("red_berry_juice_water_block", () -> new LiquidBlock(ModFluids.SOURCE_RED_BERRY_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    public static final RegistryObject<LiquidBlock> YELLOW_BERRY_JUICE_FLUID_BLOCK = BLOCKS.register("yellow_berry_juice_water_block", () -> new LiquidBlock(ModFluids.SOURCE_YELLOW_BERRY_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
