package com.liu.dinterceptor.config;

import com.liu.dinterceptor.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/8/17 15:59
 * Copyright ©2022 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        设置拦截器
        registry.addInterceptor(new LoginInterceptor())
//                添加拦截路径
                .addPathPatterns("/**")
//                排除登录页
                .excludePathPatterns("/login");
    }
}
