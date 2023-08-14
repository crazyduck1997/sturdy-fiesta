package com.frank.demo.service.impl;

import com.frank.demo.dao.UserMapper;
import com.frank.demo.model.dto.UserDTO;
import com.frank.demo.model.po.User;
import com.frank.demo.model.vo.UserVO;
import com.frank.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author frank
 * @date 2022/11/22 22:25
 * @Description
 */
@Service(value = "userService")
public class UserServiceImpl<T> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public List<UserDTO> queryUserInfo(int id) {
        List<UserDTO> userDTOs = userMapper.findById(id);
        return userDTOs;
    }

}
