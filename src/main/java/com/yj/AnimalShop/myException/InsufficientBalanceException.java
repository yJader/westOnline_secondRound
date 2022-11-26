package com.yj.AnimalShop.myException;

/**
 * @Author yJade
 * @Date 2022-11-26 15:45
 * @Package com.yj.AnimalShop.myException
 * 余额不足异常时抛出
 */
public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
