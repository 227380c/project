package com.example.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;
import com.example.service.MongoService;
@Controller
public class UserController {
	@Resource  
    private MongoService mongoService;    
    // 查询  
    @RequestMapping(value = "/addUser")  
    public String addUser() {  
        User user = new User();  
        user.setName("hehe");  
        user.setAge(30);  
        mongoService.insert(user);  
        return "successlogin";  
    }  
}
