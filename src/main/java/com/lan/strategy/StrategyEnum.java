package com.lan.strategy;

/**
 * Created by lan on 2017/5/17.
 */
public enum StrategyEnum  {
    isNum(1, "是否数字"),

    notEmpty(2, "非空"),

    maxLengh(3, "最大长度");

    //    CARD_RECHARGE(4, "充值卡");

    private int value;

    private String description;

    private StrategyEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int value() {
        return value;
    }

    public String description() {
        return description;
    }
    public static StrategyEnum valueOf(int value) {
        for(StrategyEnum type : StrategyEnum.values()) {
            if(type.value() == value) {
                return type;
            }
        }
        return null;
    }

}
