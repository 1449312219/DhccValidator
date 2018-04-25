package com.dhcc.ms.datatype;

import com.dhcc.ms.schema.SystemType;

/**
 * 开始日期
 * @author Huangzuzhen
 *
 */
public class StartDate implements BaseDataType<String> {

    /**
     * 开始日期
     */
    private String startDate;

    public StartDate(String startDate) {
        this.startDate = startDate;
    }

    public String transTo(SystemType systemId) {
        // TODO Auto-generated method stub
        return null;
    }

    public String transFrom(String source, SystemType systemId) {
        // TODO Auto-generated method stub
        return null;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

}
