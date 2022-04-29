package com.myfirstmod.firstmod;

import com.myfirstmod.firstmod.init.BlockInit;
import com.myfirstmod.firstmod.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("firstmod")
public class FirstMod {
	
	public static final String MOD_ID = "firstmod";
	
	public static final CreativeModeTab RAYAN_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
		}
	};
	
	public FirstMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}