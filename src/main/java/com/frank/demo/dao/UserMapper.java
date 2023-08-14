package com.frank.demo.dao;

import com.frank.demo.model.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author frank
 * @date 2022/11/22 22:26
 * @Description
 */
@Mapper
public interface UserMapper {

//    @Select("select id, username name, age from u_user where id = #{id}")
    List<UserDTO> findById(@Param("id") int id);

    void update(@Param("user") UserDTO userDTO);



}
