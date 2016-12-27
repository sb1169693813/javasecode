package com.sun.demo1;
public class TestInnerClass {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}


