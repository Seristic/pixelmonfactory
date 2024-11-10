package com.seristic.pixelmonfactory.common.init;

import com.seristic.pixelmonfactory.PixelmonFactory;
import com.seristic.pixelmonfactory.common.food.ModFood;
import com.seristic.pixelmonfactory.common.item.ModItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


@Mod.EventBusSubscriber(modid = PixelmonFactory.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PixelmonFactory.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PIXELMONFACTORY_TAB = TABS.register("pixelmonfactory_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.INCOMPLETEPOKEBALL.get()))
                    .title(Component.translatable("creativetab.pixelmonfactory_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        // Pokeballs
                        pOutput.accept(ModItem.INCOMPLETEPOKEBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEGREATBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEULTRABALL.get());
                        pOutput.accept(ModItem.INCOMPLETEDIVEBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEFASTBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEDUSKBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEFEATHERBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEFRIENDBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEGIGATONBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEHEALBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEHEAVYBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEJETBALL.get());
                        pOutput.accept(ModItem.INCOMPLETELOVEBALL.get());
                        pOutput.accept(ModItem.INCOMPLETELUREBALL.get());
                        pOutput.accept(ModItem.INCOMPLETELUXURYBALL.get());
                        pOutput.accept(ModItem.INCOMPLETENETBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEPARKBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEPREMIERBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEQUICKBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEREPEATBALL.get());
                        pOutput.accept(ModItem.INCOMPLETESAFARIBALL.get());
                        pOutput.accept(ModItem.INCOMPLETESPORTBALL.get());
                        pOutput.accept(ModItem.INCOMPLETETIMERBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEWINGBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEMOONBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEANCIENTGREATBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEANCIENTHEAVYBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEANCIENTPOKEBALL.get());
                        pOutput.accept(ModItem.INCOMPLETEANCIENTULTRABALL.get());

                        // Healing Items
                        pOutput.accept(ModItem.EMPTY_POTION.get());
                        pOutput.accept(ModItem.BERRY_BOWL.get());

                        // Crafting
                        pOutput.accept(ModItem.PLATINUMBASEPLATE.get());
                        pOutput.accept(ModItem.SILVERBASEPLATE.get());
                        pOutput.accept(ModItem.IRONBASEPLATE.get());
                        pOutput.accept(ModItem.ALUMINUMBASEPLATE.get());
                        pOutput.accept(ModItem.WOODENBASEPLATE.get());

                        // Misc Items
                        pOutput.accept(ModItem.BLUE_BERRY_JUICE_BUCKET.get());
                        pOutput.accept(ModItem.GREEN_BERRY_JUICE_BUCKET.get());
                        pOutput.accept(ModItem.PINK_BERRY_JUICE_BUCKET.get());
                        pOutput.accept(ModItem.PURPLE_BERRY_JUICE_BUCKET.get());
                        pOutput.accept(ModItem.RED_BERRY_JUICE_BUCKET.get());
                        pOutput.accept(ModItem.YELLOW_BERRY_JUICE_BUCKET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}

