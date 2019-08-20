package com.staringStar.object.user.service;

public interface UserService {
	public static void sayHello(String str) {
		System.out.println("User : " + str + "says hello");
	} 
	
	public void sayGoodby(String str);
}
