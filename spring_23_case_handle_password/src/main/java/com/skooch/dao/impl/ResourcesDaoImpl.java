package com.skooch.dao.impl;

import com.skooch.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {
        return password.equals("root"); //模拟校验
    }
}
