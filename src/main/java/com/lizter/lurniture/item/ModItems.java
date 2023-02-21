package com.lizter.lurniture.item;

import com.lizter.lurniture.Lurniture;
import com.lizter.lurniture.item.custom.FlippableCoinItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Lurniture.MOD_ID);

    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STACK_OF_COINS = ITEMS.register("stack_of_coins",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLIPPABLE_COIN = ITEMS.register("flippable_coin",
            () -> new FlippableCoinItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
