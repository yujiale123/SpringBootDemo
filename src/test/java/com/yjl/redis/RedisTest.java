package com.yjl.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

/**
 * @author yjl
 * @create 2020-09-02-12:39
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        //字符串string
        // redisTemplate.opsForValue().set("str","yjl");
        redisTemplate.boundValueOps("set").set("yjl");
        System.out.println("str:" + redisTemplate.opsForValue().get("str"));
        //hash散列
        redisTemplate.boundHashOps("s_key").put("name", "heima");
        redisTemplate.boundHashOps("s_key").put("age", "15");

        //获取所有域对应的值
        Set set = redisTemplate.boundHashOps("s_key").keys();
        System.out.println("hash散列所有的域：" + set);
        List list = redisTemplate.boundHashOps("s_key").values();
        System.out.println("hash散列所有的域值：" + list);

        //list列表
        redisTemplate.boundListOps("1_key").leftPush("a");
        redisTemplate.boundListOps("1_key").leftPush("b");
        redisTemplate.boundListOps("1_key").leftPush("c");
        list = redisTemplate.boundListOps("1_key").range(0, -1);
        System.out.println("list所有元素" + list);
        //set集合
        redisTemplate.boundSetOps("set_key").add("a", "b", "c");
        set = redisTemplate.boundSetOps("set_key").members();
        System.out.println("集合的元素：" + set);
        //sorted set有序集合
        redisTemplate.boundZSetOps("z_key").add("a", 30);
        redisTemplate.boundZSetOps("z_key").add("b", 20);
        redisTemplate.boundZSetOps("z_key").add("c", 10);
        set = redisTemplate.boundZSetOps("z_key").range(0, -1);
        System.out.println("有序集合的元素：" + set);
    }
}
