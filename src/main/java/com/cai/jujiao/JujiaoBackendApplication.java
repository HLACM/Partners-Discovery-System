package com.cai.jujiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author HLACM
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("com.cai.jujiao.mapper")
public class JujiaoBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(JujiaoBackendApplication.class, args);
    }
}
