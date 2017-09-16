package com.shatec.pos.pospharmacy.repository;

import com.shatec.pos.pospharmacy.model.User;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by amantha on 9/16/2017.
 */
public interface UserRepository extends Repository<User,Long>{

    User save(User user);

    User getUserByNic(String nic);

    List<User> findAll();


}
