package com.dyzwj.dto;

import java.io.Serializable;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName UserDto.java
 * @Description TODO
 * @createTime 2020年07月13日 15:39:00
 */
public class UserDto implements Serializable {

    private Integer id;

    private String name;

    private Integer gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
