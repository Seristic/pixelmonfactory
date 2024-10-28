package com.seristic.pixelmonfactory.common.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class ModTags {

    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation("pixelmonfactory", name));
        }

        private static TagKey<Block> createForgeTag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TIER1BASES = createTag("t1_bases");

        public static final TagKey<Item> TIER2BASES = createTag("t2_bases");

        public static final TagKey<Item> TIER3BASES = createTag("t3_bases");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation("pixelmonfactory", name));
        }

        private static TagKey<Item> createForgeTag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation("forge", name));
        }
    }

    public static class Fluids {
        public static final TagKey<Fluid> BERRYJUICE = createTag("berry_juice");

        private static TagKey<Fluid> createTag(String name) {
            return TagKey.create(Registries.FLUID, new ResourceLocation("pixelmonfactory", name));
        }

        private static TagKey<Fluid> createForgeTag(String name) {
            return TagKey.create(Registries.FLUID, new ResourceLocation("forge", name));
        }
    }
}
