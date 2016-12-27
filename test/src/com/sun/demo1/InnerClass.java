package com.sun.demo1;

public class InnerClass {

	public static void main(String[] args) {
		//Outer.Inner oi = new Outer().new Inner();
		//oi.method();
		
		/*
		Outer o = new Outer();
		o.print();
		*/

		/*
		Outer.Inner oi = new Outer().new Inner();
		oi.method();
		*/
		
		Outer o = new Outer();
		o.print();
	}
}


class Outer {
	/*
	private int num = 10;
	private class Inner {
		public void method() {
			System.out.println(num);
		}
	}

	public void print() {
		Inner i = new Inner();
		i.method();
	}*/
	private int num = 120;
	class Inner{
		//内部类可以直接访问外部类的成员，包括私有。
		public void method(){
			System.out.println(num);
		}
	}

	//外部类要访问内部类的成员，必须创建对象。

	public void print(){
		Inner i = 	new Inner();
		i.method();
	}
}
