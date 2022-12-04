package com.yj.animalShop.pojo;

/**
 * @Author yJade
 * @Date 2022-11-26 13:33
 * @Package com.yj.pojo
 */
public class Snake extends Animal{
    private Boolean IsPoisonous;

    public Snake(String name, Integer age, String sex, Double purchasePrice, Double price, Boolean isPoisonous) {
        super(name, age, sex, purchasePrice, price);
        IsPoisonous = isPoisonous;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "IsPoisonous=" + IsPoisonous +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", price=" + price +
                '}';
    }
}
