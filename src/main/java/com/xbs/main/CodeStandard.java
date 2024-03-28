package com.xbs.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.xbs.interfaces.FunctionInterface;

public class CodeStandard {
	public static void main(String args[]) {
//		ArrayList<String> list = new ArrayList<>();
//		list.add("0");
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		List<String> subList = list.subList(0, 2);
//		subList.set(0, "1");
//		subList.add("6");
//		String[] array = new String[subList.size()];
//		subList.toArray(array);
//		for(int i = 0; i< list.size(); i ++) {
//			System.out.println(list.get(i));
//		}
//		for(int i = 0; i< array.length; i ++) {
//			System.out.println(array[i]);
//		}
//		List<String> arrayList = new ArrayList<>(Arrays.asList(array));
//		
//		List<String> list2 = new ArrayList<String>();
//		list2.add("1");
//		list2.add("2");
//		Iterator<String> iterator = list2.iterator();
//		while (iterator.hasNext()) {
//			String item = iterator.next();
//			if ("2".equals(item)) {
//				list2.remove(item);
//			}
//		}
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println("----" + list2.get(i));
//		}
		
		System.nanoTime();
		FunctionInterface function = (source, target)-> source + target;
		System.out.println(function.add(1, 2));
	}
}
