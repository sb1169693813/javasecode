package com.sun.demo1;

//Ҫ��ʹ����֪�ı������ڿ���̨���30��20��10��
public class Outer {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer.this.num);
		}
	}
}
