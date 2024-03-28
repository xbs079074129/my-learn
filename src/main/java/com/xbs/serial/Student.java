/**	
 * <br>
 * Copyright 2014 IFlyUN. All rights reserved.<br>
 * <br>			 
 * Package: com.xbs.serial <br>
 * FileName: Student.java <br>
 * <br>
 * @version
 * @author bsxu
 * @created 2019年8月1日
 * @last Modified 
 * @history
 */

package com.xbs.serial;

import java.io.Serializable;

/**
 * {该处请说明该class的含义和作用}
 *  
 *  @author bsxu
 *  @lastModified       
 *  @history           
 */
public class Student implements Serializable,Cloneable{
    
    /**
     * Comment for <code>serialVersionUID</code>,｛该处说明该变量的含义及作用｝
     */
    private static final long serialVersionUID = 842484161602196115L;

    private String name;
    
    private String age;
    
    private Mark mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws CloneNotSupportedException {
        Student student = (Student)super.clone();
        Mark mark = (Mark)student.mark.clone();
        student.setMark(mark);
        return student;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", mark=" + mark + "]";
    }
}
