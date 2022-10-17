package com.skooch.dao.impl;

import com.skooch.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String name) {
        System.out.println("id: " + id + ", name: " + name);
        return "itcast";
    }
}
