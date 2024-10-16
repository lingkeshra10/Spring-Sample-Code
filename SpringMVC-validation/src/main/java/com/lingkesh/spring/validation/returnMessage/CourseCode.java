package com.lingkesh.spring.validation.returnMessage;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
public @interface CourseCode {

    // define default course code
    public String value() default "LUV";

    // define default error message
    public String message() default "must start with LUV";

    // define default groups
    public Class<?>[] groups() default{};

    // define default payloads
    public Class<? extends Payload>[] payload() default {};
}
