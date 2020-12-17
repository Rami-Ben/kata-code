package com.gildedrose.executor;

import com.gildedrose.Item;
import java.util.function.Consumer;

import java.util.function.Predicate;

public class GildedRoseExecutorImpl implements IGildedRoseExecutor {

    private final Predicate<Item> predicate;
    private final Consumer<Item> biConsumer;
    
    public GildedRoseExecutorImpl(Predicate<Item> predicate, Consumer<Item> biConsumer) {
        this.predicate = predicate;
        this.biConsumer = biConsumer;
    }
    
    @Override
    public boolean isApplicableFor(Item item) {
        return predicate.test(item);
    }

    @Override
    public void execute(Item item) {
        biConsumer.accept(item);
    }
    
    
}
