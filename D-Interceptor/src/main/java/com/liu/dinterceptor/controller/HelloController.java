package com.liu.dinterceptor.controller;

import com.liu.dinterceptor.bean.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/8/17 14:50
 * Copyright ©2021 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

@RestController
public class HelloController {

    @Resource
    private User user;


    @GetMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,HttpSession session){
        user.setUsername(username);
        user.setPassword(password);
        session.setAttribute("user",user);
        return "登录成功";
    }


    @GetMapping("/index")
    public String hello(HttpSession session){
//        Object user1 = session.getAttribute("user");
//        if (user1==null){
//            return "未登录";
//        }
        return "登录成功，这是主页";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "退出成功";
    }






}
