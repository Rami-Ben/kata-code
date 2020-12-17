package com.gildedrose;

import com.gildedrose.sellin.SellInExecutorFactory;
import com.gildedrose.quality.QualityExecutorFactory;
import java.util.Arrays;
import com.gildedrose.executor.IGildedRoseExecutor;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.asList(items).forEach(entry -> {
            IGildedRoseExecutor qualityExecutor = QualityExecutorFactory.executorFor(entry);
            qualityExecutor.execute(entry);

            IGildedRoseExecutor InSellexecutor = SellInExecutorFactory.executorFor(entry);
            InSellexecutor.execute(entry);
        });
    }
}
