package com.demo.ssm.service;

import com.demo.ssm.entity.User;

//创建一个UserService继承BaseService，并指定具体的实体类型
//为什么要再写一个UserService接口？不同对象的业务体系不同，BaseService并不能完全替代不同对象的具体行为表现
public interface UserService extends BaseService<User> {

    void add(User user) throws Exception;
}
