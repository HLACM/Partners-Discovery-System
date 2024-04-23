package com.cai.jujiao.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: HLACM
 * @Date: 2024年04月24日 14:50
 * @Version: 1.0
 * @Description:
 */
@Data
public class LoginInfoVo implements Serializable {
    private static final long serialVersionUID = -912733698680364100L;
    private String social_uid;
    private String faceimg;
    private String nickname;
    private Integer code;
    private String gender;
}
