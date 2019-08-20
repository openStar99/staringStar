package com.staringStar.starCloud.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.staringStar.object.user.service.impl.UserServiceImpl;
import com.staringStar.starCloud.validator.SayHelloValidator;

//import io.prometheus.client.Summary;
@Component
@Aspect
public class ControllerAspect {
//	private static final String REQUEST_PAYLOAD_STRING = "Request Payload";
//	private static final String EXCEPTION_OCCUR_STRING = "Exception occurs";
//	private static final Summary REQUEST_BTYES = Summary.build().name("requests_bytes").labelNames("Method", "Path")
//            .help("Request size in bytes.").register();
//	private static final Summary RESPONSE_BYTES = Summary.build().name("response_bytes").labelNames("Method", "Path")
//            .help("Response size in bytes.").register();
//	private static final Summary REQUEST_LATENCY = Summary.build().name("requests_latency_seconds")
//            .labelNames("Method", "Path").help("Request latency in seconds.").register();
	
	@Pointcut("within(com.staringStar.object.firstLogin.controller.*)")
	public void controllerPointcut() {
		
	}
	
	@Before(value = "controllerPointcut()")
	public void firstAround() throws Throwable{
		System.out.println("first around ");
	}
	
//	@DeclareParents(value="com.staringStar.object.user.service.UserServiceImpl+",
//					defaultImpl=UserServiceImpl.class)
//	public SayHelloValidator sayHelloValidator;
}
