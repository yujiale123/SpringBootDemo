package com.yjl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author yjl
 * @create 2020-09-01-15:41
 * spring boot工程都有一个启动引导类，是工程入口类
 * 并且在引导类上添加@SpringBootApplication
 **/
@SpringBootApplication
//扫描mybatis所有的业务mapper接口
//@MapperScan("com.yjl.mapper")
@MapperScan("com.yjl.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
