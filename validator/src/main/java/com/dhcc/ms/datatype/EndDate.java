package com.dhcc.ms.datatype;

import com.dhcc.ms.schema.SystemType;

/**
 * 结束日期
 * @author Huangzuzhen
 *
 */
public class EndDate implements BaseDataType<String> {
    /**
     * 结束日期
     */
    private String endDate;

    public EndDate(String endDate) {
        this.endDate = endDate;
    }

    public String transTo(SystemType systemId) {
        // TODO Auto-generated method stub
        return null;
    }

    public String transFrom(String source, SystemType systemId) {
        // TODO Auto-generated method stub
        return null;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
