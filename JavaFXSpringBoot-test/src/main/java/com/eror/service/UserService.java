package com.eror.service;

import com.eror.bean.User;
import com.eror.generic.GenericService;

public interface UserService extends GenericService<User> {

	boolean authenticate(String email, String password);
	
	User findByEmail(String email);
	
}
