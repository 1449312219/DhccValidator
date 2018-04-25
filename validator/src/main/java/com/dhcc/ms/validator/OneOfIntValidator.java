package com.dhcc.ms.validator;

import java.lang.reflect.Method;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OneOfIntValidator implements ConstraintValidator<OneOfInt, Integer> {
    private static Logger LOGGER = LoggerFactory.getLogger(OneOfIntValidator.class);
    /**
     * 需要校验的枚举类型
     */
    private Class<?> classType;

    public void initialize(OneOfInt oneOf) {
        this.classType = oneOf.value();
    }

    public boolean isValid(Integer value, ConstraintValidatorContext arg1) {
        try {
            Method m = classType.getDeclaredMethod("getValues", null);
            String object = classType.getEnumConstants()[0].toString();
            List<Integer> result = (List<Integer>) m.invoke(Enum.valueOf((Class<Enum>) classType, object), null);
            return result.contains(value);
        } catch (Exception e) {
            LOGGER.error("OneOfIntValidator Validation failed!", e);
        }
        return false;
    }

}
