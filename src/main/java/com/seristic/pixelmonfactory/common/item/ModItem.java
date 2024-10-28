package com.seristic.pixelmonfactory.common.item;

import com.pixelmonmod.pixelmon.client.gui.battles.battleScreens.screens.bag.ItemMenuButton;
import com.seristic.pixelmonfactory.common.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    // Pokeballs
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "pixelmonfactory");
    public static final RegistryObject<Item> INCOMPLETEPOKEBALL = ITEMS.register("incompletepokeball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEGREATBALL = ITEMS.register("incompletegreatball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEULTRABALL = ITEMS.register("incompleteultraball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEDIVEBALL = ITEMS.register("incompletediveball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEDUSKBALL = ITEMS.register("incompleteduskball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEFASTBALL = ITEMS.register("incompletefastball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEFEATHERBALL = ITEMS.register("incompletefeatherball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEFRIENDBALL = ITEMS.register("incompletefriendball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEGIGATONBALL = ITEMS.register("incompletegigatonball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEHEALBALL = ITEMS.register("incompletehealball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEHEAVYBALL = ITEMS.register("incompleteheavyball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEJETBALL = ITEMS.register("incompletejetball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETELOVEBALL = ITEMS.register("incompleteloveball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETELUREBALL = ITEMS.register("incompletelureball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETELUXURYBALL = ITEMS.register("incompleteluxuryball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETENETBALL = ITEMS.register("incompletenetball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEPARKBALL = ITEMS.register("incompleteparkball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEPREMIERBALL = ITEMS.register("incompletepremierball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEQUICKBALL = ITEMS.register("incompletequickball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEREPEATBALL = ITEMS.register("incompleterepeatball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETESAFARIBALL = ITEMS.register("incompletesafariball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETESPORTBALL = ITEMS.register("incompletesportball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETETIMERBALL = ITEMS.register("incompletetimerball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEWINGBALL = ITEMS.register("incompletewingball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEMOONBALL = ITEMS.register("incompletemoonball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEANCIENTGREATBALL = ITEMS.register("incompleteancientgreatball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEANCIENTHEAVYBALL = ITEMS.register("incompleteancientheavyball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEANCIENTPOKEBALL = ITEMS.register("incompleteancientpokeball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEANCIENTULTRABALL = ITEMS.register("incompleteancientultraball", () -> new Item(new Item.Properties()));

    // Healing
    public static final RegistryObject<Item> EMPTY_POTION = ITEMS.register("empty_potion", () -> new Item(new Item.Properties().stacksTo(16)));

    // Crafting
    public static final RegistryObject<Item> PLATINUMBASEPLATE = ITEMS.register("platinum_base_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODENBASEPLATE = ITEMS.register("wooden_base_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRONBASEPLATE = ITEMS.register("iron_base_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVERBASEPLATE = ITEMS.register("silver_base_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUMBASEPLATE = ITEMS.register("aluminum_base_plate", () -> new Item(new Item.Properties()));

    // Misc Items
    public static final RegistryObject<Item> BLUE_BERRY_JUICE_BUCKET = ITEMS.register("blue_berry_juice_bucket", () -> new BucketItem(ModFluids.SOURCE_BLUE_BERRY_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> GREEN_BERRY_JUICE_BUCKET = ITEMS.register("green_berry_juice_bucket", () -> new BucketItem(ModFluids.SOURCE_GREEN_BERRY_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> PINK_BERRY_JUICE_BUCKET = ITEMS.register("pink_berry_juice_bucket", () -> new BucketItem(ModFluids.SOURCE_PINK_BERRY_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> PURPLE_BERRY_JUICE_BUCKET = ITEMS.register("purple_berry_juice_bucket", () -> new BucketItem(ModFluids.SOURCE_PURPLE_BERRY_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> RED_BERRY_JUICE_BUCKET = ITEMS.register("red_berry_juice_bucket", () -> new BucketItem(ModFluids.SOURCE_RED_BERRY_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> YELLOW_BERRY_JUICE_BUCKET = ITEMS.register("yellow_berry_juice_bucket", () -> new BucketItem(ModFluids.SOURCE_YELLOW_BERRY_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
