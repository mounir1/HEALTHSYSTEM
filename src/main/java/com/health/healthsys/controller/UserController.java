package com.health.healthsys.controller;

import com.health.healthsys.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
        @RequestMapping("hello")
public class UserController {

    private UserService mUserService;

    public UserController(UserService aUserService) {
        mUserService = aUserService;
    }

    public UserService getUserService() {
        return mUserService;
    }

    @GetMapping("/dunya")
    public String login() {
        return getUserService().getUser();
    }
}
