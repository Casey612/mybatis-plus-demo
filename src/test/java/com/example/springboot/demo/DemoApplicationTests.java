package com.example.springboot.demo;

//import com.example.springboot.demo.entity.User;
//import com.example.springboot.demo.mapper.UserMapper;

import com.example.springboot.demo.entity.User;
import com.example.springboot.demo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }


    @Test
    public void testUserCRUD(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(4, userList.size());
        userList.forEach(System.out::println);
    }

}
