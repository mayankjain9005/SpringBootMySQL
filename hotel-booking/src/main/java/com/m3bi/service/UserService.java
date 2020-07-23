package com.m3bi.service;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.m3bi.entity.User;
@Service
@Configurable

public interface UserService {
   User retriveUser(int userId);
   void updatePoints(User user);
   Iterable<User> findAllUsers();
   

}
