package com.sun.string;

public class Demo4_stringTo {

	/**
	 * ��һ���ַ�������ĸ��ɴ�д��������ĸ����Сд
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "woaiSUNBin";
		String str2 = str.substring(0,1).toUpperCase().concat(str.substring(1).toLowerCase());
		System.out.println(str2);
	}

}
