package com.hand.pojo;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 13:55
 * @Description
 */
public class Address {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
