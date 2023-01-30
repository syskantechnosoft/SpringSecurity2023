package com.syskan.service;

import org.springframework.stereotype.Service;

import com.syskan.exception.UserNotFoundException;
import com.syskan.model.User;

@Service
public interface UserService {
    public void saveUser(User user);
    public User getUserByNameAndPassword(String name, String password) throws UserNotFoundException;
}
