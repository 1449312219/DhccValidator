package com.dhcc.ms.schema.base;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.ms.schema.BaseSchema;

public enum DefaultCertType implements BaseSchema<String> {
    /**
     * 身份证
     */
    ID_CARD("身份证", "01"), 
    /**
     * 户口簿
     */
    RESIDENCE_BOOKLET("户口簿", "02"), 
    /**
     * 军官证
     */
    MILI_CERT("军官证", "03"), 
    /**
     * 其他证件
     */
    OTHER("其他证件", "99");
    private String certName;
    private String certType;

    private DefaultCertType(String certName, String certType) {
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
        DefaultCertType[] values = DefaultCertType.values();
        for (DefaultCertType value : values) {
            strList.add(value.getCertType());
        }
        return strList;
    }

    public static DefaultCertType getByValue(String value) {
        for (DefaultCertType item : values()) {
            if (item.getCertType().equals(value)) {
                return item;
            }
        }
        return null;
    }

}
