package com.demo.ssm.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.demo.ssm.dao.UserDao;
import com.demo.ssm.entity.User;
import com.demo.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//创建UserServiceImpl实现UserService接口
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 添加用户，一般来说需要检查用户为空、用户名为空、密码为空
     */
    public void add(User user) throws Exception {
        //先检查用户是否存在
        if (null == user) {
            //抛出用户为空的自定义异常
            //throw new UserCanNotBeNullException("User can not be Null");
            System.out.println("User can not be Null");
        }
        //用户名不能为空检查
        if (StringUtils.isEmpty(user.getLoginId())) {
            //抛出用户名为空的自定义异常
            //throw new UserNameCanNotBeNullException("User name can not be Null");
            System.out.println("User name can not be Null");
        }
        //用户密码不能为空检查
        if (StringUtils.isEmpty(user.getPwd())) {
            //抛出用户密码为空的自定义异常
            //throw new UserPwdCanNotBeNullException("User name can not be Null");
        }
        //由于我这个是仓库管理系统，根据业务需求来说，我们的用户基本信息都是不能为空的
        //基本信息包括：姓名、年龄、用户名、密码、性别、手机号，年龄大于18
        if (StringUtils.isEmpty(user.getDuty())
                || StringUtils.isEmpty(user.getSex())
                || user.getAge() > 18
                || StringUtils.isEmpty(user.getCellNumber())) {
            //其他综合异常
            //throw new OtherThingsException("Some use's base info can not be null");
            System.out.println("Some use's base info can not be null");
        }
        //已经存在相同用户
        if (null != userDao.findOneById(user.getLoginId())) {
            //存在相同的用户异常
            //throw new UserAireadyExistException("Register User Failed，Because the  user Aiready exist");
            System.out.println("Register User Failed，Because the  user Aiready exist");
        }
        int result = 0; //受影响的行数默认为0
        try {
            result = userDao.add(user);
        } catch (Exception e) {
            System.out.println("添加用户失败,用户已经存在");
            //其他用户添加失败异常
            //throw new OtherThingsException(e);
            System.out.println("添加用户失败,用户已经存在");
        }
        if (result > 0)
            System.out.println("添加用户成功");
    }
}
