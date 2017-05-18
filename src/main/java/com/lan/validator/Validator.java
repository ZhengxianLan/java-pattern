package com.lan.validator;

import com.lan.strategy.ValidStrategy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lan on 2017/5/17.
 */
public class Validator {
    List<ValidFunc> list = new LinkedList<ValidFunc>();

    public void add(String toBeValid, ValidStrategy validStrategy, String errMsg) {
        list.add(new ValidFunc(toBeValid, validStrategy, errMsg));
    }

    public boolean start() {
        for (ValidFunc func : list) {
            if (!func.valid()) {
                return false;
            }
        }
        return true;
    }
}
