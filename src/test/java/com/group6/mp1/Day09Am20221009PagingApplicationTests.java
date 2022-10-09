package com.group6.mp1;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.group6.mp1.entity.User;
import com.group6.mp1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Day09Am20221009PagingApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId(100000+i);
            user.setName("name" + i);
            user.setAge(i);
            user.setEmail("email");
            user.setAddress("address");
            userMapper.insert(user);
        }
    }

    @Test
    void test20221009(){
        Page<User> userPage = new Page<>(2,9);
        Page<User> userPage1 = userMapper.selectPage(userPage, null);
        List<User> records = userPage1.getRecords();
        for (User user :
                records) {
            System.out.println(user);
        }

    }

}
