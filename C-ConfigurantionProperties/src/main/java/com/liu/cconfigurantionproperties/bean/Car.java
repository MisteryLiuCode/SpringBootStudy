package com.liu.cconfigurantionproperties.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/8/17 11:02
 * Copyright ©2021 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

@Data
@ToString
@Component
@ConfigurationProperties(prefix="mycar")
public class Car {

    private String brand;

    private String price;

}
