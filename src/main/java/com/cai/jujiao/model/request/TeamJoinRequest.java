package com.cai.jujiao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: HLACM
 * @Date: 2024年03月16日 14:31
 * @Version: 1.0
 * @Description:
 */
@Data
public class TeamJoinRequest implements Serializable {
    private static final long serialVersionUID = 4439560746192024859L;
    /**
     * 队伍id
     */
    private Long teamId;
    /**
     * 队伍密码
     */
    private String password;
}
