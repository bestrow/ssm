package com.demo.ssm.service;

import com.demo.ssm.BaseTest;
import com.demo.ssm.entity.User;
import com.demo.ssm.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseTest {
    @Autowired
    private UserServiceImpl userService;
    //此处直接使用UserService的实现类，主要是方便抛出异常，然后异常出现时候可以针对性的处理

    @Test
    public void testAdd()throws Exception {
        User user = new User();
        user.setLoginId("33");
        user.setPwd("111");
        user.setName("rrrr");
        user.setAge(30);
        user.setSex("女");
        userService.add(user);
    }
}
