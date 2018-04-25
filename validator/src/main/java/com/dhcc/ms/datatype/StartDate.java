package com.dhcc.ms.datatype;

import com.dhcc.ms.schema.SystemType;

public class StartDate implements BaseDataType<String> {

    private String startDate;

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
