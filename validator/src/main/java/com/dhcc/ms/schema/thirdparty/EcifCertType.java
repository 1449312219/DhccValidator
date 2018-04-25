package com.dhcc.ms.schema.thirdparty;

import java.util.ArrayList;
import java.util.List;

import com.dhcc.ms.schema.BaseSchema;
import com.dhcc.ms.schema.base.DefaultCertType;

public enum EcifCertType implements BaseSchema<String> {
    ID_CARD("身份证", "0"), RESIDENCE_BOOKLET("户口簿", "1"), MILI_CERT("军官证", "2"), OTHER("其他证件", "9");
    private String certName;
    private String certType;

    private EcifCertType(String certName, String certType) {
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
        EcifCertType[] values = EcifCertType.values();
        for(EcifCertType value : values) {
            strList.add(value.getCertType());
        }
        return strList;
    }

    public static EcifCertType getByValue(String value) {
        for (EcifCertType item : values()) {  
            if (item.getCertType().equals(value)) {  
                return item;  
            }
        }  
        return null;
    }
}
