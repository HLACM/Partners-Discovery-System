package com.cai.jujiao.model.request;

import com.cai.jujiao.common.PageRequest;
import lombok.Data;

/**
 * @Author: HLACM
 * @Date: 2024年03月13日 09:46
 * @Version: 1.0
 * @Description:
 */
@Data
public class UserSearchRequest extends PageRequest {
    private static final long serialVersionUID = 5579195046213219475L;
    private String username;
}
