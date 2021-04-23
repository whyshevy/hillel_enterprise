package com.example.demo.abstractcrud.controller;

import com.example.demo.abstractcrud.model.User;
import com.example.demo.abstractcrud.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abstract/user")
public class UserController extends AbstractController<User, UserService> {
    public UserController(UserService service) {
        super(service);
    }
}