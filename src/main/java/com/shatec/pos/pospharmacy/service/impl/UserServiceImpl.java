package com.shatec.pos.pospharmacy.service.impl;

import com.shatec.pos.pospharmacy.model.User;
import com.shatec.pos.pospharmacy.repository.UserRepository;
import com.shatec.pos.pospharmacy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by amantha on 9/16/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public User getUserByNic(String nic){
        return userRepository.getUserByNic(nic);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
