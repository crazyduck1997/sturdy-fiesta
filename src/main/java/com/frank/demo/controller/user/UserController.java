package com.frank.demo.controller.user;

import com.frank.demo.common.ResultBody;
import com.frank.demo.model.dto.UserDTO;
import com.frank.demo.model.vo.ChildUserVO;
import com.frank.demo.model.vo.UserVO;
import com.frank.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author frank
 * @date 2022/11/22 22:18
 * @Description
 */
@Log4j2
@RestController
@RequestMapping("/api/user/")
@Api(tags = "用户")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("info")
    @ApiOperation(value = "用户信息")
    public ResultBody<List<UserDTO>> getUserInfo(@RequestParam("id") int id){
        List<UserDTO> userDTOS = userService.queryUserInfo(id);
        return new ResultBody<>(userDTOS);
    }

}
