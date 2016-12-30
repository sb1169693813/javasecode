package com.heima.test;

import java.util.Scanner;

public class Test2 {

	/**
	 *  A:案例演示
	 * 
		需求：把字符串反转
			举例：键盘录入"abc"		
			输出结果："cba"
			
		用StringBuffer的功能实现	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个字符串：");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(line);
		sb.reverse();
		System.out.println(sb);
	}

}
