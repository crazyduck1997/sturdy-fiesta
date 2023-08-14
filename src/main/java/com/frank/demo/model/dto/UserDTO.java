package com.frank.demo.model.dto;

import com.frank.demo.model.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @Author frank
 * @date 2022/11/22 22:17
 * @Description
 */

@ToString
public class UserDTO extends ParentDTO{

    private int id;

    private List<String> nameList;

    private List<Integer> ageList;

    private String test;

    public UserDTO() {
    }

    public UserDTO(int id, List<String> nameList, List<Integer> ageList, String test) {
        super();
        this.id = id;
        this.nameList = nameList;
        this.ageList = ageList;
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public UserVO toVO(){
        UserVO userVO = new UserVO();
        return userVO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.test = "123";
        this.nameList = nameList;
    }

    public List<Integer> getAgeList() {
        return ageList;
    }

    public void setAgeList(List<Integer> ageList) {
        this.ageList = ageList;
    }
}
