package com.sooriya.Validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String[] value() default "CSE";
	
	public String message() default "Must start with CSE";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};

	

}