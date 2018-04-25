package com.dhcc.ms.datatype;

import com.dhcc.ms.schema.SystemType;
import com.dhcc.ms.schema.base.DefaultCustomerLevel;
import com.dhcc.ms.validator.OneOfInt;
/**
 * 用户等级
 * @author Huangzuzhen
 *
 */
public class CustomerLevel implements BaseDataType<Integer> {
    /**
     * 用户等级
     */
    @OneOfInt(value = DefaultCustomerLevel.class, message = "非法数据")
    private int customerLevel;

    public CustomerLevel(int customerLevel) {
        this.customerLevel = customerLevel;
    }

    public Integer transTo(SystemType systemId) {
        // TODO Auto-generated method stub
        return null;
    }

    public Integer transFrom(Integer source, SystemType systemId) {
        // TODO Auto-generated method stub
        return null;
    }

    public int getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(int customerLevel) {
        this.customerLevel = customerLevel;
    }

}
