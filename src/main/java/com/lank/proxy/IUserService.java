package com.lank.proxy;

/**
 * @author lank
 * @since 2021/7/21 21:03
 */
public interface IUserService {

    UserVO login(String username, String password);

    UserVO register(String username, String password);
}
