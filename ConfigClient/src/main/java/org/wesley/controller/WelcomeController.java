package org.wesley.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class WelcomeController {
    @Autowired
    private Environment environment;

    @Value("${user.role}")
    private  String userRole;

    @GetMapping("/getUserInfo")
    public String getUserRole(){
        return userRole;
    }

    @GetMapping("/msg")
    public String welcome(){
        return environment.getProperty("welcome.msg");
    }
}
