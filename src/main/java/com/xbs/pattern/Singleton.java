package com.xbs.pattern;

/**
 * DCL 双检锁/双重校验锁单例模式
 * 
 * @author bsxu
 *
 */
public class Singleton {
	private volatile static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					return new Singleton();
				}
			}
		}
		return instance;
	}
}
