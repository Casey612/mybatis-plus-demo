package com.example.springboot.demo.service.impl;

import com.example.springboot.demo.entity.User;
import com.example.springboot.demo.mapper.UserMapper;
import com.example.springboot.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuki
 * @since 2018-08-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
