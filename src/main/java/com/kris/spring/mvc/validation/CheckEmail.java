package com.kris.spring.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) // сохранится вплоть до выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class) // вся бизнес логика будет в этом классе
public @interface CheckEmail {
    public String value() default "xyz.com";
    public String message() default "email must ends with xyz.com";

    public Class <?>[]groups() default {};
    public Class <?extends Payload>[]  payloads() default {};

}
