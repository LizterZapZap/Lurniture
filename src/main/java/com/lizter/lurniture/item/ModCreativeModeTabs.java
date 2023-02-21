package com.lizter.lurniture.item;

import com.lizter.lurniture.Lurniture;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Lurniture.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab LURNITURE_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        LURNITURE_TAB = event.registerCreativeModeTab(new ResourceLocation(Lurniture.MOD_ID, "lurniture_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.COIN.get()))
                        .title(Component.translatable("creativemodetab.lurniture_tab")));
    }
}
