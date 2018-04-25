package com.dhcc.ms.schema;

public enum SystemType {
    /**
     * 核心系统
     */
    ACCT("核心系统", 1), 
    /**
     * 二代支付系统
     */
    CNAPS("二代支付系统", 2), 
    /**
     * 客户信息系统
     */
    ECIF("客户信息系统", 3);
    
    private String systemName;
    private int index;

    private SystemType(String systemName, int index) {
        this.systemName = systemName;
        this.index = index;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
