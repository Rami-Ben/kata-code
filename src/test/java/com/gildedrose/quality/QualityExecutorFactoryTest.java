/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.quality;

import com.gildedrose.Item;
import com.gildedrose.executor.IGildedRoseExecutor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author EXH892
 */
public class QualityExecutorFactoryTest {
    
    public QualityExecutorFactoryTest() {
    }

    @Test
    public void testExecutorFor() {
        System.out.println("executorFor");
        Item item = new Item("test", 4, 4);
        IGildedRoseExecutor result = QualityExecutorFactory.executorFor(item);
        assertTrue(result.isApplicableFor(item));
    }
    
}
