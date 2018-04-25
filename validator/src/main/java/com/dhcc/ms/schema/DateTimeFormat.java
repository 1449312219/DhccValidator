package com.dhcc.ms.schema;

import org.apache.commons.lang3.time.DateFormatUtils;
/**
 * 时间格式
 * @author Huangzuzhen
 *
 */
public enum DateTimeFormat {
    /**
     * 年月日格式：yyyy-MM-dd
     */
    DATE(DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.getPattern(), 1), 
    /**
     * 时分秒：HH:mm:ss，24小时制
     */
    TIME("HH:mm:ss", 2), 
    /**
     * 年月日时分秒：yyyy-MM-dd HH:mm:ss，24小时制
     */
    DATE_TIME("yyyy-MM-dd HH:mm:ss", 3), 
    /**
     * 年月日时分秒毫秒：yyyy-MM-dd HH:mm:ss SSS，24小时制
     */
    DATE_TIME_MS("yyyy-MM-dd HH:mm:ss SSS", 4);

    private String name;
    private int index;

    private DateTimeFormat(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
