/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.quality;

import com.gildedrose.Item;
import java.util.function.Consumer;

/**
 *
 * @author EXH892
 */
public class QualityConsumer implements Consumer<Item> {

    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;
    protected static final int DEFAULT_FACTOR = 1;
    private final int step;

    public QualityConsumer(int step) {
        this.step = step;
    }

    @Override
    public void accept(Item item) {
        item.quality = ensureInRange(item.quality - step * getFactor(item));
    }

    protected int getFactor(Item item) {
        return DEFAULT_FACTOR;
    }

    private int ensureInRange(int value) {
        return Math.min(Math.max(value, MIN_QUALITY), MAX_QUALITY);
    }
}
