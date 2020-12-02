package com.hand.config;

import com.hand.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 17:31
 * @Description
 */
@Configuration
@ComponentScan("com.hand.pojo")
@Import({HandConfig2.class})
public class HandConfig {

    @Bean
    public User getUser(){
        return new User();
    }

}
