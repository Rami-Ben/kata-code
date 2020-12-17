package com.gildedrose.quality;

import com.gildedrose.Item;
import com.gildedrose.executor.GildedRoseExecutorImpl;

import java.util.Arrays;
import java.util.List;
import com.gildedrose.executor.IGildedRoseExecutor;

public class QualityExecutorFactory {

    public static IGildedRoseExecutor executorFor(Item item){
        return EXECUTORS.stream()
                .filter(exec -> exec.isApplicableFor(item))
                .findAny()
                .orElse(new GildedRoseExecutorImpl((Item i) -> true, new BasicQualityConsumer()));
    }

    private static final List<IGildedRoseExecutor> EXECUTORS = Arrays.asList(new GildedRoseExecutorImpl((Item item) -> Arrays.asList("Backstage passes to a TAFKAL80ETC concert", "Aged Brie").contains(item.name), new IncreaseQualityConsumer()),
            new GildedRoseExecutorImpl((Item item) -> "Sulfuras, Hand of Ragnaros".equals(item.name), new NoQualityDecreaseConsumer()),
            new GildedRoseExecutorImpl((Item item) -> "Conjured".equals(item.name), new DoubleDecreaseQualityConsumer())
            
    );
    
    
}
