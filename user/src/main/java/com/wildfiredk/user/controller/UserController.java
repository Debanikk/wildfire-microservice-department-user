package com.wildfiredk.user.controller;

import com.wildfiredk.user.entity.User;
import com.wildfiredk.user.service.UserService;
import com.wildfiredk.user.valueObjects.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveuser")
    public User saveUserData(@RequestBody User userData){
        log.info("Inside saveUserData method of UserController");
        return userService.saveUserData(userData);
    }

    @GetMapping("/getUserWithDepartmentId/{Id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("Id") Long userId) {
        log.info("Inside ResponseTemplateVO method of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
