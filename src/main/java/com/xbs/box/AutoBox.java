/**	
 * <br>
 * Copyright 2014 IFlyUN. All rights reserved.<br>
 * <br>			 
 * Package: com.xbs.box <br>
 * FileName: AutoBox.java <br>
 * <br>
 * @version
 * @author bsxu
 * @created 2019年8月1日
 * @last Modified 
 * @history
 */

package com.xbs.box;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 自动装包和拆包
 * 
 * @author bsxu
 * @lastModified
 * @history
 */
public class AutoBox {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("122", 10);
        List<String> list = new ArrayList<>();
        int i = 0;
        System.out.println(i);
        a : for (; i < 100; i++) {
            b : for (int j = 0; j < 10; j++) {
                c : for (int k = 0; k < 10; k++) {
                    break c;
                }
                System.out.println("label c");
                break a;
            }
            System.out.println("label b");
        }
    }
}
