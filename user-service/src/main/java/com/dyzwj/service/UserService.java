package com.dyzwj.service;

import com.dyzwj.api.UserInterface;
import com.dyzwj.dto.UserDto;
import org.springframework.stereotype.Service;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2020年07月13日 15:43:00
 */
@Service
public class UserService implements UserInterface {
    @Override
    public UserDto sayHello(Integer id) {
        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setName("name:" + id);
        userDto.setGender(1);
        return userDto;

    }
}
