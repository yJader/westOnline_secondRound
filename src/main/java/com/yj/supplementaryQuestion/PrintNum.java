package com.yj.supplementaryQuestion;

/**
 * @Author yJade
 * @Date 2022-12-04 11:32
 * @Package com.yj.supplementaryQuestion
 */
public class PrintNum {
    private static final Object myLock = new Object();
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9}, arr2 = {2, 4, 6, 8, 10};
        printNum(arr1, arr2);
    }

    static void printNum(int[] arr1, int[] arr2) {
        Printer1 printer1 = new Printer1();
        printer1.setArr(arr1);
        printer1.setName("奇数线程");
        Thread printer2 = new Thread(new Printer2(arr2), "偶数线程");

        printer1.start();
        printer2.start();
    }

    static class Printer1 extends Thread {
        private int arr[];
        int p=0;

        public void setArr(int[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            while (p<arr.length) {
                synchronized (myLock) {
                    System.out.println(Thread.currentThread().getName()+"print:" + arr[p++]);
                    myLock.notify(); //唤醒另一个线程
                    if(p<arr.length){ //防止线程一直在等待而不结束
                        try {
                            myLock.wait(); //释放锁, 转移到另一个线程
                            //notify并不会立刻转交锁, 而是在当前线程执行完毕/wait后, 才会转交锁给其他线程
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

    static class Printer2 implements Runnable {
        private int arr[];
        int p=0;

        public Printer2(int[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            while (p<arr.length) {
                synchronized (myLock) {
                    System.out.println(Thread.currentThread().getName()+"print:" + arr[p++]);
                    myLock.notify(); //唤醒另一个线程
                    if(p<arr.length){//防止线程一直在等待而不结束
                        try {
                            myLock.wait(); //释放锁, 转移到另一个线程
                            //notify并不会立刻转交锁, 而是在当前线程执行完毕/wait后, 才会转交锁给其他线程
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
