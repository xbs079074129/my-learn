package com.xbs.algorithm;

public class Application {
    public static void main(String[] args) {
        /**long timestampBefore = System.currentTimeMillis();
        System.out.println("" + Fiboracci.f(100));
        long timestampAfter = System.currentTimeMillis();
        System.out.println("Fiboracci cost:" + (timestampAfter - timestampBefore));**/

        long timestampBefore2 = System.currentTimeMillis();
        System.out.println("" + MemFiboracci.f(100L));
        long timestampAfter2 = System.currentTimeMillis();
        System.out.println("MemFiboracci cost:" + (timestampAfter2 - timestampBefore2));
    }
}
