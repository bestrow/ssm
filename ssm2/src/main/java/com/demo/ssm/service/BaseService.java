package com.demo.ssm.service;

//创建一个BaseService接口，用泛型解耦
public interface BaseService<T> {
    void add(T t) throws Exception;
}
