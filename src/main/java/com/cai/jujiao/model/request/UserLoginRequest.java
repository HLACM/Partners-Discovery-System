package com.cai.jujiao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: HLACM
 * @Date: 2024年01月16日 23:36
 * @Version: 1.0
 * @Description: 用户登录请求体
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -8842079325810599899L;
    private String userAccount;
    private String userPassword;
}
