package com.wipro.service;


import com.wipro.dto.UserVO;
import com.wipro.model.User;

import java.util.List;

public interface UserService {

    void save(UserVO user);

    List<User> findAll();

    User findById(int id);

    void deleteById(int id);

}

