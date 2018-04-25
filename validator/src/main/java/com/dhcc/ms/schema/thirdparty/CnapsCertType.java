package com.dhcc.ms.schema.thirdparty;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.ms.schema.BaseSchema;

public enum CnapsCertType implements BaseSchema<String> {
    /**
     * 身份证
     */
    ID_CARD("身份证", "1"), 
    /**
     * 户口簿
     */
    RESIDENCE_BOOKLET("户口簿", "2"), 
    /**
     * 军官证
     */
    MILI_CERT("军官证", "3"), 
    /**
     * 其他证件
     */
    OTHER("其他证件", "9");
    private String certName;
    private String certType;

    private CnapsCertType(String certName, String certType) {
        this.setCertName(certName);
        this.setCertType(certType);
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public List<String> getValues() {
        List<String> strList = new ArrayList<String>();
        CnapsCertType[] values = CnapsCertType.values();
        for(CnapsCertType value : values) {
            strList.add(value.getCertType());
        }
        return strList;
    }

    public static CnapsCertType getByValue(String value) {
        for (CnapsCertType item : values()) {  
            if (item.getCertType().equals(value)) {  
                return item;  
            }
        }  
        return null;
    }
}
