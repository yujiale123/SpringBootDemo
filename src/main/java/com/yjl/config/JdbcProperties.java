package com.yjl.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yjl
 * @create 2020-09-01-16:56
 * ConfigurationProperties:从配置文件applicaiton中读取配置项
 * prefix:配置项前缀
 *
 **/
//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    private String url;
    private String username;
    private String password;
    private String driverClassName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
