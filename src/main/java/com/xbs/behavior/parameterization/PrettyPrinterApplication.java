package com.xbs.behavior.parameterization;

import java.util.ArrayList;
import java.util.List;

/**
 * 打印主程序
 */
public class PrettyPrinterApplication {
    public static void main(String[] args) {
        List<Apple> inventorys = new ArrayList<>();
        //java8以前使用匿名内部类方式
        prettyPrintApple(inventorys, new PrettyPrinter() {


            @Override
            public boolean filter(Apple apple) {
                return false;
            }
        });
        //JAVA8使用行为参数化
        prettyPrintApple(inventorys, (Apple apple) -> "red".equals(apple.getColor()));
    }

    public static void prettyPrintApple(List<Apple> inventory, PrettyPrinter printer) {
        for(Apple apple:inventory) {
            //String output = printer.print();
            //System.out.println(output);
        }
    }
}
