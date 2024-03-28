package com.xbs.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MemFiboracci {
    public static Map<Long, Long> memoization = new HashMap<>();

    public static Long f(Long n) {
        if(n <= 0 ) {
            throw new IllegalArgumentException("入参只能为大于0的整数");
        }
         if(n == 1) {
            return 1L;
        } else if(n == 2) {
            return 1L;
        } else if (memoization.containsKey(n)) {
            return memoization.get(n);
        } else{
            //System.out.println("f(" + n + ") = " + "f(" + (n -1) + ")" + " + f(" + (n -2) + ")" );
             Long result = f(n -1) + f(n - 2);
            memoization.put(n, result);
            return result;
        }
    }

    public static void main(String[] args) {
        long timestampBefore = System.currentTimeMillis();
        System.out.println("" + f(40L));
        long timestampAfter = System.currentTimeMillis();
        System.out.println("cost:" + (timestampAfter - timestampBefore));
    }
}
