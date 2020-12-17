package com.gildedrose.executor;

import com.gildedrose.Item;

public interface IGildedRoseExecutor {

    void execute(Item item);

    boolean isApplicableFor(Item item);
    
    public enum ExecutorType{
        QUALITY, SELL_IN
    }
}
