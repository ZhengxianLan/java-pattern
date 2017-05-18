package com.lan.strategy;

import com.lan.strategy.impl.IsNum;

/**
 * Created by lan on 2017/5/17.
 */
public class StrategyFactory {
    public static ValidStrategy isNum(){
        return new IsNum();
    }
}
