package com.skooch.dao.impl;

import com.skooch.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
        //记录程序当前执行执行（开始时间）
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }

    public int update(){
        System.out.println("book dao update ...");
        return 100;
    }

    public void delete(){
        System.out.println("book dao delete ...");
    }

    public void select(){
        System.out.println("book dao select ...");
    }
}
