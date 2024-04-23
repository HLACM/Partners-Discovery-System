package com.cai.jujiao.model.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @Author: HLACM
 * @Date: 2024年03月13日 09:18
 * @Version: 1.0
 * @Description:
 */
@Data
public class UpdateTagRequest implements Serializable {
    private static final long serialVersionUID = 5482203079092270874L;
    private long id;
    private Set<String> tagList;
}
