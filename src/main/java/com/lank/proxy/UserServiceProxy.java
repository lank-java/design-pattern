package com.lank.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author lank
 * @since 2021/7/21 21:05
 * 代理类
 */
@AllArgsConstructor
@Data
public class UserServiceProxy implements IUserService {

    private UserService userService;

    public UserVO login(String username, String password) {
        long startTimestamp = System.currentTimeMillis();

        // ... 省略login逻辑...
        UserVO userVO = userService.login(username, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        System.out.println("login方法执行时间:" + responseTime);

        return userVO;
    }

    public UserVO register(String username, String password) {
        long startTimestamp = System.currentTimeMillis();

        // ... 省略register逻辑...
        UserVO userVO = userService.register(username, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        System.out.println("register方法执行时间:" + responseTime);

        return userVO;
    }
}
