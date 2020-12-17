/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.quality;

import com.gildedrose.Item;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author EXH892
 */
public class IncreaseQualityConsumerTest {
    
    public IncreaseQualityConsumerTest() {
    }

    @Test
    public void testQualityConsumerZeroQualityTest() {
        Item item = new Item("test", 0, 1);
        IncreaseQualityConsumer increaseQualityConsumer = new IncreaseQualityConsumer();
        increaseQualityConsumer.accept(item);
        assertEquals(item.quality, 0);
    }
    
    @Test
    public void testQualityConsumerNonZeroQualityTest() {
        Item item = new Item("test", 1, 3);
        IncreaseQualityConsumer increaseQualityConsumer = new IncreaseQualityConsumer();
        increaseQualityConsumer.accept(item);
        assertEquals(item.quality, 8);
    }
    
}
