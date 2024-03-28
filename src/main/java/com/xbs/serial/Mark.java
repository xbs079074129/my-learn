/**	
 * <br>
 * Copyright 2014 IFlyUN. All rights reserved.<br>
 * <br>			 
 * Package: com.xbs.serial <br>
 * FileName: Mark.java <br>
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
public class Mark implements Serializable, Cloneable{
    /**
     * Comment for <code>serialVersionUID</code>,｛该处说明该变量的含义及作用｝
     */
    private static final long serialVersionUID = 1545031769031735036L;

    private int chinese;
    
    private int math;

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Mark [chinese=" + chinese + ", math=" + math + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }
}




