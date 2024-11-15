package aster.otherworld.item;

import aster.otherworld.Otherworld;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item TALLOW = registerItem("tallow", new Item(new Item.Settings()));
	public static final Item MOONFEATHER = registerItem("moonfeather", new Item(new Item.Settings()));
	public static final Item FLOATSTONE = registerItem("floatstone", new Item(new Item.Settings()));
	public static final Item DEVOUR = registerItem("devour", new Item(new Item.Settings()));
	public static final Item FRAY = registerItem("fray", new Item(new Item.Settings()));
	public static final Item SILK = registerItem("silk", new Item(new Item.Settings()));
	public static final Item ORIGIN_ORE = registerItem("origin_ore", new Item(new Item.Settings()));
	public static final Item JELLY = registerItem("jelly", new Item(new Item.Settings()));
	public static final Item SCRAP = registerItem("scrap", new Item(new Item.Settings()));
	public static final Item DARKBOOK = registerItem("darkbook", new Item(new Item.Settings()));
	public static final Item MEMORY = registerItem("memory", new Item(new Item.Settings()));


	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Otherworld.MOD_ID, name), item);
	}



	public static void registerModItems() {
		Otherworld.LOGGER.info("Registering Modded Items");


		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.add(TALLOW);
			entries.add(MOONFEATHER);
			entries.add(DEVOUR);
			entries.add(SCRAP);
			entries.add(SILK);
			entries.add(JELLY);
			entries.add(MEMORY);
			entries.add(FLOATSTONE);
			entries.add(DARKBOOK);
			entries.add(FRAY);
			entries.add(ORIGIN_ORE);

		});
	}
}
