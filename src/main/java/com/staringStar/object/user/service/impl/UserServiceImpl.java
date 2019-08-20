/**
 * 
 */
package com.staringStar.object.user.service.impl;

import org.springframework.stereotype.Service;

import com.staringStar.object.user.service.UserService;

/**
 * @author I343419
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Override
	public void sayGoodby(String str) {
		// TODO Auto-generated method stub
		System.out.println("User : " + str + "says gooodby");
	}
	
}
