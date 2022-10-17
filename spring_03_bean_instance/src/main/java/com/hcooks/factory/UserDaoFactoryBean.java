package com.hcooks.factory;

import com.hcooks.dao.UserDao;
import com.hcooks.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    @Override
    //代替原始实例工厂中创建对象的方法
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    // 调整单例还是非单例,一般不写
    public boolean isSingleton() {
        return true;
    }
}
