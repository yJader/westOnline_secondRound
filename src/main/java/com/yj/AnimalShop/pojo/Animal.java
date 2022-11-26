package com.yj.AnimalShop.pojo;

/**
 * @Author yJade
 * @Date 2022-11-26 13:27
 * @Package com.yj.pojo
 */
public abstract class Animal {
    String name;
    Integer age;
    String sex;
    Double purchasePrice;
    Double price;

    public Animal(String name, Integer age, String sex, Double purchasePrice, Double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.purchasePrice = purchasePrice;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", purchasePrice=" + purchasePrice +
                '}';
    }
}
