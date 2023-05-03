package com.milind.usermanagement.controller;

import com.milind.usermanagement.mail.Mail;
import com.milind.usermanagement.model.User;
import com.milind.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getMappings")
    public User getUser() {
        Mail mail = new Mail();
        User user = userService.getUser();
        mail.sendMail(user.toString());
        return user;
    }
}
