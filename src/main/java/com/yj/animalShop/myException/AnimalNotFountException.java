package com.yj.animalShop.myException;

/**
 * @Author yJade
 * @Date 2022-11-26 15:43
 * @Package com.yj.AnimalShop.myException
 * 没找到动物异常，店内没有动物可买时抛出
 */
public class AnimalNotFountException extends RuntimeException{
    public AnimalNotFountException() {
    }

    public AnimalNotFountException(String message) {
        super(message);
    }
}
