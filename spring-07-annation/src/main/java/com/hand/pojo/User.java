package com.hand.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 16:57
 * @Description
 */
//等价于<bean>
@Component
public class User {
    @Value("帅神")  // 相当于 <property name="name" value="真帅呀"/>
    public String name;
}
