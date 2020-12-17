package com.gildedrose;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    Item[] items = new Item[]{
        new Item("+5 Dexterity Vest", 10, 20), //
        new Item("Aged Brie", 2, 0), //
        new Item("Elixir of the Mongoose", 5, 7), //
        new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
        new Item("Sulfuras, Hand of Ragnaros", -1, 80),
        new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        // this conjured item does not work properly yet
        new Item("Conjured Mana Cake", 3, 6)};

    @Test
    void GildedRoseTest() {
        Map<Integer, List<Integer>> expectedMapSellIn = new HashMap();
        expectedMapSellIn.put(0, Arrays.asList(10, 2, 5, 0, -1, 15, 10, 5, 3));
        expectedMapSellIn.put(1, Arrays.asList(9, 1, 4, 0, -1, 14, 9, 4, 2));

        Map<Integer, List<Integer>> expectedMapQuality = new HashMap();
        expectedMapQuality.put(0, Arrays.asList(20, 0, 7, 80, 80, 20, 49, 49, 6));
        expectedMapQuality.put(1, Arrays.asList(19, 5, 6, 80, 80, 21, 50, 50, 5));

        GildedRose app = new GildedRose(items);
        for (int i = 0; i < 2; i++) {
            assertEquals(expectedMapQuality.get(i),
                    Arrays.asList(items).stream()
                            .map(item -> item.quality)
                            .collect(Collectors.toList()));
            assertEquals(expectedMapSellIn.get(i),
                    Arrays.asList(items).stream()
                            .map(item -> item.sellIn)
                            .collect(Collectors.toList()));
            app.update();
        }
    }

}
