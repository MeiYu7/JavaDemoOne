package com.myq.service;

import com.myq.model.Users;

import java.util.List;

public interface UsersService {
    // 新增一条记录
    int insert (Users record);

    // 选择一条记录
    Users selectAccount(String account);

    // 显示全部
    List<Users> seleteAll();

}
