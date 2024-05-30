package net.cherrow.tutorialmod;

import net.cherrow.tutorialmod.block.ModBlocks;
import net.cherrow.tutorialmod.item.ModItemGroups;
import net.cherrow.tutorialmod.item.ModItems;
import net.cherrow.tutorialmod.util.ModCustomTrades;
import net.cherrow.tutorialmod.util.ModLootTableModifiers;
import net.cherrow.tutorialmod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItemGroups.registerItemGroups();

		LOGGER.info("Hello Fabric world!"); //hi
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();

		FuelRegistry.INSTANCE.add(ModItems.COAL_FLESH, 200);
	}
}