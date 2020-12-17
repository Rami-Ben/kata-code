/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gildedrose.quality;

/**
 *
 * @author EXH892
 */
public class NoQualityDecreaseConsumer extends QualityConsumer{
    
    private static final int NO_DECREASE_QUALITY = 0;
    
    public NoQualityDecreaseConsumer() {
        super(NO_DECREASE_QUALITY);
    }
    
}
