package com.sun.string;

import java.util.Scanner;

public class Demo7_dao {

	/**
	 * ĞèÇó£º1£»¼üÅÌÂ¼È¡×Ö·û´®abc
	 * 2£ºµ¹×ÅÊä³ö×Ö·û´®cba
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
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
