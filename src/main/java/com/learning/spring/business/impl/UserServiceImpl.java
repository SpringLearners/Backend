package com.learning.spring.business.impl;

import com.learning.spring.business.UserService;
import com.learning.spring.entity.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User generateUser(Integer id) {

        String name = RandomStringUtils.random(id, true, false);
        return new User(id, name);
    }
}
