package com.nibado.example.springmongo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nibado.example.springmongo.pojo.LoginRequest;
import com.nibado.example.springmongo.pojo.LoginResponse;
import com.nibado.example.springmongo.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository repository;

    private final Map<String, User> userSessions;

    public UserController() {
        userSessions = new HashMap<>();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponse login(@RequestBody final LoginRequest login) {
        final LoginResponse response = new LoginResponse();
        response.token = UUID.randomUUID().toString();
        return response;
    }

    @RequestMapping(value = "/whoami", method = RequestMethod.GET)
    public String whoami() {
        return "Niels";
    }
}
