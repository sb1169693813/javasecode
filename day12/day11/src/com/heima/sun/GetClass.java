package com.heima.sun;

import com.heima.eclipse.HellowWorld;



public class GetClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HellowWorld hw = new HellowWorld("sun",18);
		Class cla = hw.getClass();// 返回一个对象的运行时类
		String name = cla.getName(); // 以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称。
		//System.out.println(name);
		//System.out.println(hw.toString());
		
		//boolean equals(Object obj) 指示某个其他对象是否与此对象“相等”。 
		HellowWorld hw2 = new HellowWorld("sun",18);
		//System.out.println(hw.equals(hw2));//比较的是地址值，没有意义，要重写
		System.out.println(hw.equals(hw2));
	}

}
