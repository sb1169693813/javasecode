package com.sun.string;

import java.util.Scanner;

public class Demo7_dao {

	/**
	 * ����1������¼ȡ�ַ���abc
	 * 2����������ַ���cba
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ���ַ���");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		String s = "";
		for (int i = arr.length-1; i >=0; i--) {
			s = s + arr[i];
			
		}
		System.out.println(s);
	}

}
