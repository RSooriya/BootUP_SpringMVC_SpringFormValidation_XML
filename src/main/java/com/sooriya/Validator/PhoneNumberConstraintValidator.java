package com.sooriya.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberConstraintValidator implements 
                  ConstraintValidator<PhoneNumber,String>
{

	@Override
	public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        
		if(phoneNumber!=null)
		{
		if(phoneNumber.length()==10 && phoneNumber.startsWith("9"))
		{
			return true;
		}
		else
		{
		return false;
		}
		
		}
		else
		{
			return true;
		}
		
	}

}
