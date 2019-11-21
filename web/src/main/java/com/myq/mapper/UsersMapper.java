package com.myq.mapper;

import com.myq.model.Users;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UsersMapper {

    // 新增一条记录
    int insert (Users record);

    // 选择一条记录
    Users selectAccount(String account);

    // 显示全部
    List<Users> seleteAll();

}
