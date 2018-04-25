package com.dhcc.ms.validator;

import java.lang.reflect.Method;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OneOfStrValidator implements ConstraintValidator<OneOfStr, String> {
    private static Logger LOGGER = LoggerFactory.getLogger(OneOfStrValidator.class);
    private Class<?> classType;

    public void initialize(OneOfStr oneOf) {
        this.classType = oneOf.value();
    }

    public boolean isValid(String value, ConstraintValidatorContext arg1) {
        try {
            Method m = classType.getDeclaredMethod("getValues", null);
            String object = classType.getEnumConstants()[0].toString();
            List<String> result = (List<String>) m.invoke(Enum.valueOf((Class<Enum>) classType, object), null);
            return result.contains(value);
        } catch (Exception e) {
            LOGGER.error("OneOfStrValidator Validation failed!", e);
        }
        return false;
    }

}
