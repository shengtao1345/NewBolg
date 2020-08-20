package com.eduzzc.dao;

import com.eduzzc.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from cn_user")
    List<User> findAll();
}
