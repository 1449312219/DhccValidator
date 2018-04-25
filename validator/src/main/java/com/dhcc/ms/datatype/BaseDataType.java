package com.dhcc.ms.datatype;

import com.dhcc.ms.schema.SystemType;

public interface BaseDataType<T> {
    /**
     * 从一个其他系统标准化变量转换到本系统标准化变量
     * @param source 转换源数值
     * @param systemId 系统类型
     * @return
     */
    public T transTo(SystemType systemId);
    /**
     * 
     * @param source
     * @param systemId
     * @return
     */
    public T transFrom(T source, SystemType systemId);
}
