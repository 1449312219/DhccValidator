package com.dhcc.ms.datatype;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.validator.HibernateValidator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ValidatorFactory validatorFactory = Validation.byProvider( HibernateValidator.class )
                .configure()
                .buildValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        CertType certType = new CertType("000");
        Set<ConstraintViolation<CertType>> violationSet = validator.validate(certType);
        for (ConstraintViolation<CertType> model : violationSet) {
            System.out.println(model.getMessage());
        }
    }
}
