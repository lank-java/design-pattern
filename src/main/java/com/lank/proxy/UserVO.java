package com.lank.proxy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lank
 * @since 2021/7/21 20:32
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserVO {

    private String username;

    private String password;

}
