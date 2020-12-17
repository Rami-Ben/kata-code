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
import java.util.List;

/**
 *
 * @author EXH892
 */
public class SellInExecutorFactory {

    public static IGildedRoseExecutor executorFor(Item item) {
        return SELL_IN_EXECUTORS
                .stream().filter(exec -> exec.isApplicableFor(item))
                .findFirst()
                .get();
    }

    private static final List<GildedRoseExecutorImpl> SELL_IN_EXECUTORS = Arrays.asList(
            new GildedRoseExecutorImpl((Item i) -> "Sulfuras, Hand of Ragnaros".equals(i.name), (Item i) -> {}),
            new GildedRoseExecutorImpl((Item i) -> true, (Item i) -> i.sellIn = i.sellIn - 1)
    );

}
