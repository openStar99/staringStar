/**
 * 
 */
package com.staringStar.object.firstLogin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.staringStar.object.user.service.UserService;
import com.staringStar.starCloud.validator.SayHelloValidator;
import com.staringStar.starCloud.validator.impl.SayHelloValidatorImpl;


/**
 * @author I343419
 *
 */
@RequestMapping("/test")
@Controller
public class FirstLoginController {
	
	@Autowired
	UserService userService;
	
//	@Autowired
//	SayHelloValidator sayHelloValidator;
	
	@GetMapping("/no/annotation")
	@ResponseBody
	public Map<String, Object> noAnnotation(Integer intVal, Long longVal, String str){
		Map<String, Object> parametersMap = new HashMap<String, Object>() ;
		parametersMap.put("intVal",intVal);
		parametersMap.put("longVal",longVal);
		parametersMap.put("str",str);
	
		SayHelloValidator sayHelloValidator = new SayHelloValidatorImpl();
		if(sayHelloValidator.validate(str)) {
			UserService.sayHello(str);
			userService.sayGoodby(str);
		}
		
		return parametersMap;
	}
	public static void sayHello(String str) {
		System.out.println(str + "says hello");
	}
}
