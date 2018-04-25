package com.dhcc.ms.datatype;

import com.dhcc.ms.schema.SystemType;

public class EndDate implements BaseDataType<String> {
    
    private String endDate;

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
