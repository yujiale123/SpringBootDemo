package com.yjl.controller;

import com.yjl.config.JdbcProperties;
import com.yjl.pojo.User;
import com.yjl.service.UserService;
import jdk.nashorn.internal.scripts.JD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;


/**
 * @author yjl
 * @create 2020-09-01-15:43
 **/
@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;


    @Value("${yjl.url}")
    private  String itcastUrl;

    @Value("${yjl2.url}")
    private  String heimaUrl;


    @Autowired
    private UserService userService;

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Integer id){
        return  userService.queryById(id);
    }



    /**
     * @return
     * @GetMapping用于将HTTP get请求映射到特定处理程序的方法注解，
     * GetMapping是@RequestMapping(method = RequestMethod.GET)的缩写
     */
    @GetMapping("hello")
    public String hello() {
        System.out.println("itcastUrl"+itcastUrl);
        System.out.println("heimaUrl"+heimaUrl);
        System.out.println("dataSource" + dataSource);
        return "SpringBoot";
    }


}
