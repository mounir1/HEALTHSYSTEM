package com.health.healthsys.service;

import com.health.healthsys.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository mUserRepository;

    public UserService(UserRepository aUserRepository) {
        mUserRepository = aUserRepository;
    }

    public UserRepository getUserRepository() {
        return mUserRepository;
    }

    public String getUser() {
        return getUserRepository().getUser();
    }
}
