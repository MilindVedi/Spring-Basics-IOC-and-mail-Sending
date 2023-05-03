package com.milind.usermanagement.service;

import com.milind.usermanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class UserService {
    @Autowired
    @Qualifier("myUserBean")
    User user;

    public User getUser() {
        return user;
    }
}
