package com.lank;

import com.lank.proxy.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @author lank
 * @since 2021/7/27 0:23
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringDemoApplicationTest {

    @Resource
    private IUserService userService;

    @Test
    public void demo(){
        userService.login("lan","123");
    }

}