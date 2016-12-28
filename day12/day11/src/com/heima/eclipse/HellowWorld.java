package com.heima.eclipse;

import com.heima.animal.Cat;


public class HellowWorld {
	private String name;
	private int age;
	
	public HellowWorld(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public HellowWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HellowWorld [name=" + name + ", age=" + age + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hellowworld");
		Cat c = new Cat("aa",22);
		System.out.println(c.getName());
		c.eat();
		c.sleep();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		HellowWorld hw = (HellowWorld)obj;//向上转型
		return (this.name.equals(hw.name));//string 的equals
	}
	
	
}
