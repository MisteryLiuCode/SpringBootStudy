package com.liu.dinterceptor.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/8/17 15:23
 * Copyright ©2021 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    private String username;
    private String password;
}
