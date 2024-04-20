package com.akai.service.impl;

import com.akai.dao.UserDao;
import com.akai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    /*
    *@Autowired
    * 根据类型到容器中去寻找对应的对象,找到后给当前属性赋值
    * 不需要依赖 set方法
    * 属性类型可以是接口,会自动匹配对应的实现类对象
    * @Autowired配合 @Qualifier,可以通过名称指定注入的对象
    */
    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;
    // 普通数据类型的属性赋值 8 + String
//    @Value("cao")
//    private String sname;
//    @Value("12")
//    private Integer sage;
    @Value("${sname}")
    private String sname;
    @Value("${sage}")
    private Integer sage;
    @Override
    public void add() {
        System.out.println("UserServiceImpl invoked");
        System.out.println(sname);  // cao
        System.out.println(sage);   // 12
        userDao.addUser();
    }
}
