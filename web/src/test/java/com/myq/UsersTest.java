package com.myq;


import com.myq.mapper.UsersMapper;
import com.myq.model.Users;
import com.myq.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = {app.class})
@RunWith(SpringRunner.class)
public class UsersTest {

    @Resource
    private UsersMapper UsersMapper;

    @Test
    public void seleteAll(){
        List<Users> list = UsersMapper.seleteAll();
        System.out.println(list);
    }

}
