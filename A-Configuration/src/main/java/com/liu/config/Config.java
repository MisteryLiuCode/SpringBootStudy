package com.liu.config;

import com.liu.bean.Pet;
import com.liu.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/8/16 17:42
 * Copyright ©2021 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

@Configuration(proxyBeanMethods=false)
public class Config {

    /**
    * @Description  注册组件
    * @author 刘帅彪
     * @param
    * @return com.liu.bean.User
    * @Date 2022/8/16 17:59
    */
    @Bean
    public User user01(){
        return new User("张三",18);
    }

    /**
    * @Description  注册组件
    * @author 刘帅彪
     * @param
    * @return com.liu.bean.Pet
    * @Date 2022/8/16 17:59
    */
    @Bean
    public Pet tomcat(){
        return new Pet("tomcat");
    }
}
