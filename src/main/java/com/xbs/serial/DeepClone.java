/**	
 * <br>
 * Copyright 2014 IFlyUN. All rights reserved.<br>
 * <br>			 
 * Package: com.xbs.serial <br>
 * FileName: DeepClone.java <br>
 * <br>
 * @version
 * @author bsxu
 * @created 2019年8月1日
 * @lastModified
 * @history
 */

package com.xbs.serial;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * {该处请说明该class的含义和作用}
 * 
 * @author bsxu
 * @lastModified
 * @history
 */
public class DeepClone {

    public static void main(String[] args) {
        Student lili = new Student();
        lili.setName("lili");
        lili.setAge("12");
        Mark liliMark = new Mark();
        liliMark.setChinese(90);
        liliMark.setMath(59);
        lili.setMark(liliMark);
        System.out.println(lili);

        // shallow clone
        Student tom = new Student();
        try {
            tom = (Student) lili.clone();
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }

        System.out.println("shallow clone:" + tom);

        Mark liliMark2 = lili.getMark();
        liliMark2.setMath(60);

        System.out.println("shallow clone after update:" + tom);
        System.out.println("------------------------------");

        // deep clone

        Student kitty = new Student();
        try {
            kitty = (Student) lili.deepClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("deep clone:" + kitty);

        Mark liliMark3 = lili.getMark();
        liliMark3.setMath(61);
        System.out.println("deep clone after update:" + kitty);

        System.out.println("------------------------------");

        // serial deep clone
        Student selina = new Student();
        ByteArrayOutputStream bas = new ByteArrayOutputStream();
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(bas);
            out.writeObject(lili);
            out.flush();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            if (bas != null) {
                try {
                    bas.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        ByteArrayInputStream bai = new ByteArrayInputStream(bas.toByteArray());
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(bai);
            selina = (Student) in.readObject();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } finally {
            if (bai != null) {
                try {
                    bai.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("deep clone:" + selina);

        Mark liliMark4 = lili.getMark();
        liliMark4.setMath(62);
        System.out.println("serial deep clone after update:" + selina);

        System.out.println("------------------------------");

    }
}
