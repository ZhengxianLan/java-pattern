package com.lan.strategy.impl;

import com.lan.strategy.ValidStrategy;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by lan on 2017/5/17.
 */
public class IsNum implements ValidStrategy {
    public boolean valid(String target) {
        return StringUtils.isNumeric(target);
    }
}
