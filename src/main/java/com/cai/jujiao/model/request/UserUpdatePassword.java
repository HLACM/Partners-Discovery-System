package com.cai.jujiao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: HLACM
 * @Date: 2024年03月10日 17:22
 * @Version: 1.0
 * @Description:
 */
@Data
public class UserUpdatePassword implements Serializable {

    private static final long serialVersionUID = -7620643864967860479L;
    long id;
    private String oldPassword;
    private String newPassword;
    private String checkPassword;
}
