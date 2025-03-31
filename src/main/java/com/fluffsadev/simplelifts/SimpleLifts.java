package com.fluffsadev.simplelifts;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


@Mod(modid = "slift", name = "Simple Lifts", version = "1.0")
public class SimpleLifts {

    public static Item itemTable;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Item/Block init
        //Config Handling
        itemTable = new ItemTable().setUnlocalizedName("ItemTable");
        GameRegistry.registerItem(itemTable, itemTable.getUnlocalizedName().substring(5));
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //Proxy, TileEntity, entitty, GUI, and Packet Reg
    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }
}
