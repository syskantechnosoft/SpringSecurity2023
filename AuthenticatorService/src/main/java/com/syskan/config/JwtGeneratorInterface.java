package com.syskan.config;

import java.util.Map;

import com.syskan.model.User;

public interface JwtGeneratorInterface {

    Map<String, String> generateToken(User user);
}
