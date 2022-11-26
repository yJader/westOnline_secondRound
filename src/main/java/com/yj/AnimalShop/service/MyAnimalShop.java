package com.yj.AnimalShop.service;

import com.yj.AnimalShop.myException.AnimalNotFountException;
import com.yj.AnimalShop.myException.InsufficientBalanceException;
import com.yj.AnimalShop.pojo.Animal;
import com.yj.AnimalShop.pojo.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author yJade
 * @Date 2022-11-26 15:32
 * @Package com.yj.AnimalShop.service
 */
public class MyAnimalShop implements AnimalShop {
    private Double surplus;
    ArrayList<Animal> animals;
    ArrayList<Animal> haveSellAnimals; //记录每日售出的宠物
    ArrayList<Customer> customerRecords; //记录每日的顾客
    private Boolean isInBusiness;

    @Override
    public void bugAnimal(Animal animal) {
        if(surplus < animal.getPurchasePrice())
            throw new InsufficientBalanceException("店里就剩"+surplus+"元, 别买了,养不起");
        else {
            animals.add(animal);
            surplus -= animal.getPurchasePrice();
        }
    }

    private void showAnimals() {
        System.out.println("------------------------");
        System.out.println("店内宠物名单如下");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + "\t" + animals.get(i));
        }
        System.out.println("------------------------");
    }

    @Override
    public void entertain(Customer customer) {
        customerRecords.add(customer);
        System.out.println("欢迎您 " + customer.getName());

        if(animals.size() == 0) throw new AnimalNotFountException("店空, 速进货, 稍等");

        showAnimals();
        System.out.println("您想买哪一只捏");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        if(index > animals.size() || index < 0) throw new AnimalNotFountException("您输入的宠物不存在");

        System.out.println(animals.get(index) + "已售出");
        surplus += animals.get(index).getPrice(); //店铺余额↑
        haveSellAnimals.add(animals.get(index));
        animals.remove(index);
    }

    @Override
    public void close() {
        System.out.println("宠物店" + LocalDate.now() + "营收信息");
        double profit = 0.0, turnover = 0.0;
        for (Animal animal: haveSellAnimals) {
            profit += animal.getPrice() - animal.getPurchasePrice();
            turnover += animal.getPrice();
        }
        System.out.println("今日共有以下顾客光临");
        customerRecords.forEach(System.out::println);
        System.out.println("今日销售额" + turnover);
        System.out.println("今日利润" + profit);
    }

    public Double getSurplus() {
        return surplus;
    }

    public void setSurplus(Double surplus) {
        this.surplus = surplus;
    }

    public void addSurplus(Double add) {
        this.surplus += add;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Customer> getCustomerRecords() {
        return customerRecords;
    }

    public void setCustomerRecords(ArrayList<Customer> customerRecords) {
        this.customerRecords = customerRecords;
    }

    public Boolean getInBusiness() {
        return isInBusiness;
    }

    public void setInBusiness(Boolean inBusiness) {
        isInBusiness = inBusiness;
    }

    public MyAnimalShop() {
        this.surplus = 0.0;
        this.animals = new ArrayList<Animal>();
        this.customerRecords = new ArrayList<Customer>();
        this.isInBusiness = true;
        this.haveSellAnimals = new ArrayList<Animal>();
    }

    public MyAnimalShop(Double surplus) {
        this.surplus = surplus;
        this.animals = new ArrayList<Animal>();
        this.customerRecords = new ArrayList<Customer>();
        this.isInBusiness = true;
        this.haveSellAnimals = new ArrayList<Animal>();
    }

    public MyAnimalShop(Double surplus, ArrayList<Animal> animals) {
        this.surplus = surplus;
        this.animals = animals;
        this.customerRecords = new ArrayList<Customer>();
        this.isInBusiness = true;
        this.haveSellAnimals = new ArrayList<Animal>();
    }
}
