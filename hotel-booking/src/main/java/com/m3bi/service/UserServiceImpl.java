package com.m3bi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m3bi.DAO.UserDAO;
import com.m3bi.entity.User;

@Service("userService")
public class UserServiceImpl  implements UserService{
	@Autowired
	private UserDAO userDAO;

	@Override
	public User retriveUser(int userId) {
		Optional<User> user=userDAO.findById(userId);
		return user.get();
	}

	@Override
	public void updatePoints(User user) {
		userDAO.save(user);
	}

	@Override
	public Iterable<User> findAllUsers() {
		return userDAO.findAll();
	}


}
