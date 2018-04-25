package com.dhcc.ms.schema;

import org.apache.commons.lang3.time.DateFormatUtils;

public enum DateTimeFormat {

    DATE(DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.getPattern(), 1), TIME("HH:mm:ss", 2), DATE_TIME("yyyy-MM-dd HH:mm:ss", 3), DATE_TIME_MS("yyyy-MM-dd HH:mm:ss SSS", 4);

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
