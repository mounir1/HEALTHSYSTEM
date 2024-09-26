package com.health.healthsys.service;

import com.health.healthsys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

   // @Autowired(required = false)
    private UserRepository mUserRepository;

//    public UserService() {
//    }
//
//    public UserService(UserRepository aUserRepository) {
//        mUserRepository = aUserRepository;
//    }

    public UserRepository getUserRepository() {
        return mUserRepository;
    }

    public List<String> getUser() {
        return getUserRepository().getUserList();
    }
}
