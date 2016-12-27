package com.sun.demo2;

import com.sun.demo1.Student;

public class Test_Object {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("sunbin",25);
		/* 
		int hashCode() 
         返回该对象的哈希码值。 
		*/
		int hash = s.hashCode();
		//System.out.println(hash);
		
		// Class<? extends Object> getClass() 返回一个对象的运行时类。 
		//String getName() 以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称。 
		String name = s.getClass().getName();
		//System.out.println(name);
		
		/*
		 *  String toString() 
         * 	返回该对象的字符串表示。通常，toString 方法会返回一个“以文本方式表示”此对象的字符串。结果应是一个简明但易于读懂。建议所有子类都重写此方法。  
         * com.sun.demo1.Student@e3c624
         * getClass().getName() + '@' + Integer.toHexString(hashCode())
		*/
		String str = s.toString();
		//System.out.println(str);
		
		/*
		 *  boolean equals(Object obj) 
          	指示某个其他对象是否与此对象“相等”。 
		 * 默认情况下比较的是对象的引用是否相同。
		 * 由于比较对象的引用没有意义，一般建议重写该方法。
		 * ==是一个比较运算符号,既可以比较基本数据类型,也可以比较引用数据类型,基本数据类型比较的是值,引用数据类型比较的是地址值
		 * equals方法是一个方法,只能比较引用数据类型,所有的对象都会继承Object类中的方法,如果没有重写Object类中的equals方法,
		 * equals方法和==号比较引用数据类型无区别,重写后的equals方法比较的是对象中的属性
		 * */
		Student s2 = new Student("sunbin",26);
		System.out.println(s.equals(s2));
		
	}

}
