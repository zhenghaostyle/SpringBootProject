package com.service;

import com.domain.User;

public interface UserService {
	User findByNameAndPassword(User user);

	User getByUsername(String username);
}
