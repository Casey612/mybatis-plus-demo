package com.example.springboot.demo.mapper;

import com.example.springboot.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yuki
 * @since 2018-08-06
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
