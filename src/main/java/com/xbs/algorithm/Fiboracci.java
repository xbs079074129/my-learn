package com.xbs.algorithm;

public class Fiboracci {
    public static Long f(Long n) {
        if(n <= 0 ) {
            throw new IllegalArgumentException("入参只能为大于0的整数");
        }
        if(n == 1) {
            return 1L;
        } else if(n == 2) {
            return 1L;
        } else {
            //System.out.println("f(" + n + ") = " + "f(" + (n -1) + ")" + " + f(" + (n -2) + ")" );
            return f(n -1) + f(n - 2);
        }
    }
}
