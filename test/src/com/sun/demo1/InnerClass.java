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
		//�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽�С�
		public void method(){
			System.out.println(num);
		}
	}

	//�ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������

	public void print(){
		Inner i = 	new Inner();
		i.method();
	}
}
