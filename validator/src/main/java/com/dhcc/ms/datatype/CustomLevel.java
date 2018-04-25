package com.dhcc.ms.datatype;

import com.dhcc.ms.schema.SystemType;

public class CustomLevel implements BaseDataType<Integer> {
    private int customLevel;

    public Integer transTo(SystemType systemId) {
        // TODO Auto-generated method stub
        return null;
    }

    public Integer transFrom(Integer source, SystemType systemId) {
        // TODO Auto-generated method stub
        return null;
    }

    public int getCustomLevel() {
        return customLevel;
    }

    public void setCustomLevel(int customLevel) {
        this.customLevel = customLevel;
    }

}
