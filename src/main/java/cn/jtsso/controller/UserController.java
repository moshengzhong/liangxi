package cn.jtsso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.jtsso.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
private UserService userService;
}
