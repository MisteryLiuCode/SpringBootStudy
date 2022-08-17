package com.liu.bconditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BConditionalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BConditionalApplication.class, args);
//        校验容器中是否存在tomcat这个bean
        boolean tomcat = run.containsBean("tomcat");
        System.out.println("tomcat是否在容器中存在:"+tomcat);

        boolean user01 = run.containsBean("user01");
        System.out.println("user01是否在容器中存在:"+user01);

    }

}
