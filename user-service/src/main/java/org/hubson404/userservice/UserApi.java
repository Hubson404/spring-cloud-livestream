package org.hubson404.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    @Value("${app.user}")
    private String appUser;

    @GetMapping
    public String hello(){
        return "hello world from userApi from: " + appUser;
    }
}
