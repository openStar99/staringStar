package com.staringStar.starCloud.validator.impl;

import com.staringStar.starCloud.validator.SayHelloValidator;

public class SayHelloValidatorImpl implements SayHelloValidator{

	@Override
	public boolean validate(String str) {
		// TODO Auto-generated method stub
		System.out.println("引入新的接口:"  + SayHelloValidator.class.getSimpleName());
		return str != null;
	}
	
}
