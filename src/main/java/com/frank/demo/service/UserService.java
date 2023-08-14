package com.frank.demo.service;

import com.frank.demo.model.dto.UserDTO;
import com.frank.demo.model.vo.UserVO;

import java.util.List;

/**
 * @Author frank
 * @date 2022/11/22 22:25
 * @Description
 */
public interface UserService {

    List<UserDTO> queryUserInfo(int id);


}
