package com.hand.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 15:39
 * @Description
 */
public class People {

    @Resource(name = "cat1") // 自动装配 默认通过byName方式实现，如果找不到名字，
                // 则通过byType java自带的注解，指定配置文件中的对象，beanid，类型必须一致
    private Cat cat;
    @Autowired // 自动装配  通过byName的方式实现
    @Qualifier(value = "dogNew") // 和@Autowired搭配使用，指定配置文件中的对象，beanid，类型必须一致
    private Dog dog;

    private String name;

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
