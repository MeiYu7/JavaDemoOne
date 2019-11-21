package com.myq.controller;

import com.myq.model.Users;
import com.myq.pojo.VoResponse;
import com.myq.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value="/paltform")
@Api(value = "用户管理接口", tags = {"用户管理接口"})
public class UsersController{

    @Autowired
    private UsersService UsersService;

    @ApiOperation(value = "列表查询用户", notes = "查询用户列表")
    @RequestMapping(value = "/users/list", method = RequestMethod.GET)
    public VoResponse findList(){
        List<Users> list = UsersService.seleteAll();
        return VoResponse.getVoResponse(list);
    }

    @ApiOperation(value = "根据账号查询用户", notes = "根据账号查询用户")
    @RequestMapping(value = "/users/{account}", method = RequestMethod.GET)
    public VoResponse findByAccount(@PathVariable(value = "account") String account){
        Users user = UsersService.selectAccount(account);
        return VoResponse.getVoResponse(user);

    }

}
