package com.dhcc.ms.datatype;

import org.hibernate.validator.constraints.Length;

import com.dhcc.ms.schema.SystemType;
import com.dhcc.ms.schema.base.DefaultCertType;
import com.dhcc.ms.schema.thirdparty.AcctCertType;
import com.dhcc.ms.schema.thirdparty.CnapsCertType;
import com.dhcc.ms.schema.thirdparty.EcifCertType;
import com.dhcc.ms.validator.OneOfStr;
/**
 * 证件类型定义
 * @author Huangzuzhen
 *
 */
public class CertType implements BaseDataType<String> {
    /**
     * 证件类型
     */
    @Length(min = 2, max = 2, message = "类型长度必须为2位")
    @OneOfStr(value = DefaultCertType.class, message = "非法数据")
    private String certType;

    public String getCertType() {
        return certType;
    }

    public CertType(String certType) {
        this.certType = certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String transTo(SystemType systemId) {
        String result = "";
        DefaultCertType type = DefaultCertType.getByValue(certType);
        switch (systemId) {
        case ACCT:
            switch (type) {
            case ID_CARD:
                result = AcctCertType.ID_CARD.getCertType();
                break;
            case RESIDENCE_BOOKLET:
                result = AcctCertType.RESIDENCE_BOOKLET.getCertType();
                break;
            case MILI_CERT:
                result = AcctCertType.MILI_CERT.getCertType();
                break;
            case OTHER:
                result = AcctCertType.OTHER.getCertType();
                break;
            default:
                break;
            }
            break;
        case CNAPS:
            switch (type) {
            case ID_CARD:
                result = CnapsCertType.ID_CARD.getCertType();
                break;
            case RESIDENCE_BOOKLET:
                result = CnapsCertType.RESIDENCE_BOOKLET.getCertType();
                break;
            case MILI_CERT:
                result = CnapsCertType.MILI_CERT.getCertType();
                break;
            case OTHER:
                result = CnapsCertType.OTHER.getCertType();
                break;
            default:
                break;
            }
            break;
        case ECIF:
            switch (type) {
            case ID_CARD:
                result = EcifCertType.ID_CARD.getCertType();
                break;
            case RESIDENCE_BOOKLET:
                result = EcifCertType.RESIDENCE_BOOKLET.getCertType();
                break;
            case MILI_CERT:
                result = EcifCertType.MILI_CERT.getCertType();
                break;
            case OTHER:
                result = EcifCertType.OTHER.getCertType();
                break;
            default:
                break;
            }
            break;
        default:
            break;
        }
        return result;
    }

    public String transFrom(String source, SystemType systemId) {
        String result = "";
        switch (systemId) {
        case ACCT:
            switch (AcctCertType.getByValue(source)) {
            case ID_CARD:
                result = DefaultCertType.ID_CARD.getCertType();
                break;
            case RESIDENCE_BOOKLET:
                result = DefaultCertType.RESIDENCE_BOOKLET.getCertType();
                break;
            case MILI_CERT:
                result = DefaultCertType.MILI_CERT.getCertType();
                break;
            case OTHER:
                result = DefaultCertType.OTHER.getCertType();
                break;
            default:
                break;
            }
            break;
        case CNAPS:
            switch (CnapsCertType.getByValue(source)) {
            case ID_CARD:
                result = DefaultCertType.ID_CARD.getCertType();
                break;
            case RESIDENCE_BOOKLET:
                result = DefaultCertType.RESIDENCE_BOOKLET.getCertType();
                break;
            case MILI_CERT:
                result = DefaultCertType.MILI_CERT.getCertType();
                break;
            case OTHER:
                result = DefaultCertType.OTHER.getCertType();
                break;
            default:
                break;
            }
            break;
        case ECIF:
            switch (EcifCertType.getByValue(source)) {
            case ID_CARD:
                result = DefaultCertType.ID_CARD.getCertType();
                break;
            case RESIDENCE_BOOKLET:
                result = DefaultCertType.RESIDENCE_BOOKLET.getCertType();
                break;
            case MILI_CERT:
                result = DefaultCertType.MILI_CERT.getCertType();
                break;
            case OTHER:
                result = DefaultCertType.OTHER.getCertType();
                break;
            default:
                break;
            }
            break;
        default:
            break;
        }
        return result;
    }
}