package com.myq.service;

import com.myq.mapper.UsersMapper;
import com.myq.model.Users;
import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UsersService {

    @Autowired
    private UsersMapper UsersMapper;

    @Override
    public int insert(Users record) {
        return UsersMapper.insert(record);
    }

    @Override
    public Users selectAccount(String account) {
        return UsersMapper.selectAccount(account);
    }

    @Override
    public List<Users> seleteAll() {
        return UsersMapper.seleteAll();
    }

}
