package com.heima.test;

import java.util.Scanner;

public class Test2 {

	/**
	 *  A:������ʾ
	 * 
		���󣺰��ַ�����ת
			����������¼��"abc"		
			��������"cba"
			
		��StringBuffer�Ĺ���ʵ��	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ���ַ�����");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(line);
		sb.reverse();
		System.out.println(sb);
	}

}
