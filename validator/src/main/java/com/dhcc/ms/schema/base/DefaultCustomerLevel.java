package com.dhcc.ms.schema.base;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.ms.schema.BaseSchema;

public enum DefaultCustomerLevel implements BaseSchema<Integer> {
    /**
     * 普通用户
     */
    NORMAL("普通用户", 1), 
    /**
     * 银卡用户
     */
    SILVER("银卡用户", 2), 
    /**
     * 金卡用户
     */
    GOLD("金卡用户", 3);
    private String levelName;
    private int level;

    private DefaultCustomerLevel(String levelName, int level) {
        this.setLevelName(levelName);
        this.setLevel(level);
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Integer> getValues() {
        List<Integer> intList = new ArrayList<Integer>();
        DefaultCustomerLevel[] values = DefaultCustomerLevel.values();
        for(DefaultCustomerLevel value : values) {
            intList.add(value.getLevel());
        }
        return intList;
    }

    public static DefaultCustomerLevel getByValue(int value) {
        for (DefaultCustomerLevel item : values()) {  
            if (item.getLevel() == value) {  
                return item;  
            }  
        }  
        return null;
    }
}
