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


	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(Otherworld.MOD_ID, name), item);
	}



	public static void registerModItems() {
		Otherworld.LOGGER.info("Registering Modded Items");


		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.add(TALLOW);
		});
	}
}