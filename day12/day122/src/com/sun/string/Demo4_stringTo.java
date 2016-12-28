package com.sun.string;

public class Demo4_stringTo {

	/**
	 * 把一个字符串首字母变成大写，其他字母都是小写
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "woaiSUNBin";
		String str2 = str.substring(0,1).toUpperCase().concat(str.substring(1).toLowerCase());
		System.out.println(str2);
	}

}
