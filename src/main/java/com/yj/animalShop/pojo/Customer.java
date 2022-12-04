package com.yj.animalShop.pojo;

import java.time.LocalDate;

/**
 * @Author yJade
 * @Date 2022-11-26 15:23
 * @Package com.yj.AnimalShop.pojo
 */
public class Customer {
    private String name;
    private Integer numberOfArrivals;
    private LocalDate lastArriveTime;

    public Customer(String name, Integer numberOfArrivals, LocalDate lastArriveTime) {
        this.name = name;
        this.numberOfArrivals = numberOfArrivals;
        this.lastArriveTime = lastArriveTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfArrivals() {
        return numberOfArrivals;
    }

    public void setNumberOfArrivals(Integer numberOfArrivals) {
        this.numberOfArrivals = numberOfArrivals;
    }

    public LocalDate getLastArriveTime() {
        return lastArriveTime;
    }

    public void setLastArriveTime(LocalDate lastArriveTime) {
        this.lastArriveTime = lastArriveTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", numberOfArrivals=" + numberOfArrivals +
                ", lastArriveTime=" + lastArriveTime +
                '}';
    }
}
