package com.lan.validator;

import com.lan.strategy.ValidStrategy;

/**
 * Created by lan on 2017/5/17.
 */
public class ValidFunc {
    private String target;
    private ValidStrategy stragety;
    private String msg;

    public ValidFunc(String target, ValidStrategy strategy, String msg) {
        this.target=target;
        this.stragety=strategy;
        this.msg = msg;
    }

    public boolean valid(){
        if(!stragety.valid(this.target)){
            System.out.println(target + " : "+msg);
            return false;
        }
        return  true;
    }
}
