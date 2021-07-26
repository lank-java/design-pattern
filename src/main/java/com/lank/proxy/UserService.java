package com.lank.proxy;

import org.springframework.stereotype.Service;

/**
 * @author lank
 * @since 2021/7/21 20:31
 */
@Service
public class UserService implements IUserService{

    public UserVO login(String username, String password) {
        // ... 省略login逻辑...
        UserVO userVO = new UserVO(username, password);
        System.out.println("登录username:"+username+"password:"+password);
        return userVO;
    }


    public UserVO register(String username, String password) {
        // ... 省略login逻辑...
        UserVO userVO = new UserVO(username, password);
        System.out.println("注册username:"+username+"password:"+password);
        return userVO;
    }

}
