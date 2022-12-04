package com.yj.animalShop.service;

import com.yj.animalShop.pojo.Animal;
import com.yj.animalShop.pojo.Customer;

/**
 * @Author yJade
 * @Date 2022-11-26 15:26
 * @Package com.yj.AnimalShop.service
 */
public interface AnimalShop {
    void bugAnimal(Animal animal);

    void entertain(Customer customer);
    void close();
}
