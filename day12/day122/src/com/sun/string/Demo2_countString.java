package com.sun.string;

public class Demo2_countString {

	/**
	 * 需求：统计一个字符串中大写字母，小写字母，数字，其他字符出现的次数
	 * 分析：字符串是字符组成的，字符是有范围的，通过判断得出是否包含这个字符，在计数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;
		String s = "ASDFGasasa313132!@#$%^&**";
		for(int i =0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c >= 'A' && c<= 'Z'){
				big++;
			}else if(c>='a' && c<='z'){
				small++;
			}else if(c >= '0' && c<='9'){
				num++;
			}else{
				other++;
			}
		}
		System.out.println("大写字母的个数："+big+",小写字母的个数:"+small+",数字的个数:"+num+"其他字符的个数:"+other);
	}

}
