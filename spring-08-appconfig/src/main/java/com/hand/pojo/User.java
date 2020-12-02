package com.hand.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 17:25
 * @Description
 */
@Controller
@ComponentScan("com.hand.pojo")
public class User {
    @Value("ludongpeng")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
