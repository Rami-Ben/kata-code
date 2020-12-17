/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.quality;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author EXH892
 */
public class BasicQualityConsumerTest {
    
    public BasicQualityConsumerTest() {
    }

    @Test
    public void testQualityConsumerZeroQualityTest() {
        Item item = new Item("test", 0, 0);
        BasicQualityConsumer basicQualityConsumer = new BasicQualityConsumer();
        basicQualityConsumer.accept(item);
        assertEquals(item.quality, 0);
    }
    
    @Test
    public void testQualityConsumerNonZeroQualityTest() {
        Item item = new Item("test", 1, 1);
        BasicQualityConsumer basicQualityConsumer = new BasicQualityConsumer();
        basicQualityConsumer.accept(item);
        assertEquals(item.quality, 0);
    }
    
}
