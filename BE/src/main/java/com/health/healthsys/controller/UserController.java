package com.health.healthsys.controller;

import com.health.healthsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
        @RequestMapping("hello")
public class UserController {

    @Autowired(required = false)
    private UserService mUserService;

//    public UserController() {
//    }
//
//    public UserController(UserService aUserService) {
//        mUserService = aUserService;
//    }

    public UserService getUserService() {
        return mUserService;
    }

    @GetMapping("/dunya")
    public List<String> login() {
        //return "selam";
        return getUserService().getUser();
    }
}
