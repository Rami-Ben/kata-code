/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.quality;

import com.gildedrose.Item;

/**
 *
 * @author EXH892
 */
public class IncreaseQualityConsumer extends QualityConsumer {

    private static final int INCREASE_QUALITY = -1;
    private static final int SOLD_OUT = 0;
    private static final int QUALITY_INCREASE_BY_TWO = 2;
    private static final int QUALITY_INCREASE_BY_THREE = 3;
    private static final int QUALITY_INCREASE_BY_FIVE = 5;

    public IncreaseQualityConsumer() {
        super(INCREASE_QUALITY);
    }

    @Override
    public void accept(Item item) {
        if (item.sellIn <= SOLD_OUT) {
            item.quality = SOLD_OUT;
        } else {
            super.accept(item);
        }
    }

    @Override
    protected int getFactor(Item item) {
        if (item.sellIn <= 3) {
            return QUALITY_INCREASE_BY_FIVE;
        } else if (item.sellIn <= 5) {
            return QUALITY_INCREASE_BY_THREE;
        } else if (item.sellIn <= 10) {
            return QUALITY_INCREASE_BY_TWO;
        }
        return DEFAULT_FACTOR;
    }

}
