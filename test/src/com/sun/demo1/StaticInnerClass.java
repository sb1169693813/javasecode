package com.sun.demo1;

public class StaticInnerClass {
	public static void main(String[] args) {
		//�ⲿ����.�ڲ����� ������ = �ⲿ����.�ڲ������;
		Outer.Inner oi = new Outer.Inner();
		oi.method();
		
		Outer.Inner2.print();
	}
	
}

class Outer {
	//��̬��Ա�ڲ���
	static class Inner {
		public void method() {
			System.out.println("method");
		}
	}
	
	static class Inner2 {
		//��̬����
		public static void print() {
			System.out.println("print");
		}
	}
}