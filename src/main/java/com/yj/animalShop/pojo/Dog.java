package com.yj.animalShop.pojo;

/**
 * @Author yJade
 * @Date 2022-11-26 13:30
 * @Package com.yj.pojo
 */
public class Dog extends Animal{
    private Boolean isVaccineInjected;

    public Dog(String name, Integer age, String sex, Double purchasePrice, boolean isVaccineInjected) {
        super(name, age, sex, purchasePrice, 100.0);
        this.isVaccineInjected = isVaccineInjected;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isVaccineInjected=" + isVaccineInjected +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", price=" + price +
                '}';
    }
}
