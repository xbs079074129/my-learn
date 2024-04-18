package com.xbs.behavior.parameterization;

/**
 * 苹果作为集合元素测试java8新特性
 *
 * @ClassName Apple
 * @Author xbs 
 * @Description 作为集合元素测试java8新特性
 * @Date 2024/4/19 4:32
 **/
public class Apple {

    /**
     * 颜色
     */
    private String color;

    /**
     * 重量
     */
    private int weight;

    /**
     * 获取苹果重量
     *
     * @Description 获取苹果重量
     * @Author xbs
     * @Date 2024/4/19 5:05
     * @return int
     **/
    public int getWeight() {
        return weight;
    }

    /**
     * @Description
     * @Author xbs
     * @Date 2024/4/19 5:26 
     * @param weight 重量
     **/
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * 获取苹果颜色
     *
     * @Description 获取苹果颜色
     * @Author xbs
     * @Date 2024/4/19 5:06
     * @return java.lang.String
     **/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
