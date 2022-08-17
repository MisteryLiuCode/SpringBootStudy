package com.liu;

import com.liu.bean.User;
import com.liu.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class AConfigurationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AConfigurationApplication.class, args);

//        查看容器里面的组件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }

//        获取Config，对象
        Config bean = run.getBean(Config.class);
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user1==user);
    }

}
