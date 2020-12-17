/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.sellin;

import com.gildedrose.Item;
import com.gildedrose.executor.GildedRoseExecutorImpl;
import java.util.Arrays;
import com.gildedrose.executor.IGildedRoseExecutor;

/**
 *
 * @author EXH892
 */
public class SellInExecutorFactory {
    
    public static IGildedRoseExecutor executorFor(Item item){
        return Arrays.asList(new GildedRoseExecutorImpl((Item i) -> true, (Item i) -> i.sellIn = i.sellIn - 1))
                .stream().filter(exec -> exec.isApplicableFor(item))
                .findAny()
                .get();
    }
    
    
}
