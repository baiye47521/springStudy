package com.hand.pojo;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/1 17:57
 * @Description
 */
public class Hand {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "str='" + str + '\'' +
                '}';
    }
}
