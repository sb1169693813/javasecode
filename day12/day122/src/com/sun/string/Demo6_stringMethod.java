package com.sun.string;

public class Demo6_stringMethod {

	/**
	 *  String replace(char oldChar, char newChar) 
          ����һ���µ��ַ���������ͨ���� newChar �滻���ַ����г��ֵ����� oldChar �����ɵġ� 
          
        String replace(CharSequence target, CharSequence replacement) 
          ʹ��ָ��������ֵ�滻�����滻���ַ���ƥ������ֵĿ�����е�ÿ�����ַ���   
          
           String trim() 
          �����ַ����ĸ���������ǰ���հ׺�β���հס� 
          
           int compareTo(String anotherString) 
          ���ֵ�˳��Ƚ������ַ����� 
 int compareToIgnoreCase(String str) 
          �����Ǵ�Сд�����ֵ�˳��Ƚ������ַ����� 

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sun";
		String s2 = s1.replace('n', 's');
		System.out.println(s2);
		
		String s3 = s1.replace("su","bi" );
		System.out.println(s3);
		
		String s4 = " abc ";
		String s5 = s4.trim();
		System.out.println(s5);
		
		String s6 = "abc";
		String s7 = "bcd";
		int num = s6.compareTo(s7);
		System.out.println(num);
	}

}
