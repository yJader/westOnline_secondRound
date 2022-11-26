package com.yj.AnimalShop.pojo;

/**
 * @Author yJade
 * @Date 2022-11-26 13:31
 * @Package com.yj.pojo
 */
public class Cat extends Animal{

    public Cat(String name, Integer age, String sex) {
        super(name, age, sex, 50.0, 200.0);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", price=" + price +
                '}';
    }
}
