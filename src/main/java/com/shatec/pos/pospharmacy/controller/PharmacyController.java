package com.shatec.pos.pospharmacy.controller;

import com.shatec.pos.pospharmacy.model.User;
import com.shatec.pos.pospharmacy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by amantha on 9/16/2017.
     */
@RestController
@RequestMapping(value = "/pharmacy")

public class PharmacyController {

    @Autowired
    UserService  userService;
    // tester
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @CrossOrigin
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @RequestMapping(value = "/user/nic/{nic}",method = RequestMethod.GET)
    public User getUserByNic(@PathVariable String nic){
        return userService.getUserByNic(nic);
    }
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
