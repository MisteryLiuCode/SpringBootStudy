package com.liu.dinterceptor.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/8/17 15:45
 * Copyright ©2021 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        验证是否登录
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if (user!=null){
            return true;
        }
        session.setAttribute("error","还未登录，请登录");
        return false;
    }
}
