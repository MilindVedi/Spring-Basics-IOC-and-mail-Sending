package com.milind.usermanagement;

import com.milind.usermanagement.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean(name = "myUserBean")
    public User myUser() {
        User user = new User();
        user.setUserId(123);
        user.setAddress("address");
        user.setName("Niks");
        user.setPhoneNo("9555093302");
        return user;
    }
}
