package com.dhcc.ms.datatype;

import com.dhcc.ms.schema.SystemType;

public interface BaseDataType<T> {
    /**
     * 从一个本系统标准化变量转换到其他系统标准化变量
     * @param systemId 第三方系统的系统类型
     * @return 返回第三方系统对应值
     */
    public T transTo(SystemType systemId);
    /**
     * 从一个其他系统标准化变量转换到本系统标准化变量
     * @param source 第三方系统数据值
     * @param systemId 第三方系统的系统类型
     * @return 返回本系统对应值
     */
    public T transFrom(T source, SystemType systemId);
}
