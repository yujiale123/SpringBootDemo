package com.yjl.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author yjl
 * @create 2020-09-01-16:41
 **/

//@PropertySource("classpath:application.properties")
@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

      /*@Value("${jdbc.url}")
      String url;
      @Value("${jdbc.username}")
      String username;
      @Value("${jdbc.password}")
      String password;
      @Value("${jdbc.driverClassName}")
      String driverClassName;
      @Bean
      public DataSource dataSource(){
          DruidDataSource druidDataSource = new DruidDataSource();
          druidDataSource.setDriverClassName(driverClassName);
          druidDataSource.setUrl(url);
          druidDataSource.setUsername(username);
          druidDataSource.setPassword(password);
          return druidDataSource;
      }*/
   /* @Bean
    public DataSource dataSource(JdbcProperties jdbcProperties) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }*/
   /*@Bean
   // 声明要注入的属性前缀，Spring Boot会自动把相关属性通过set方法注入到DataSource中
   @ConfigurationProperties(prefix = "jdbc")
   public DataSource dataSource() {
       return new DruidDataSource();
   }*/
}
