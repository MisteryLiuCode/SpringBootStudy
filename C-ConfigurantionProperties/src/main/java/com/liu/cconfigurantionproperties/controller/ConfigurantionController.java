package com.liu.cconfigurantionproperties.controller;

import com.liu.cconfigurantionproperties.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/8/17 11:21
 * Copyright ©2021 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */
@RestController
public class ConfigurantionController {

    @Autowired
    private Car car;

    @RequestMapping("/hello")
    public Car car(){
        return car;
    }

}
