package com.shatec.pos.pospharmacy.service;

import com.shatec.pos.pospharmacy.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by amantha on 9/16/2017.
 */
public interface UserService {

   User addUser (User user);

   User getUserByNic(String nic);

   List<User> getAllUsers();


}
