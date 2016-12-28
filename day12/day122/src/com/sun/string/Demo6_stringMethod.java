package com.sun.string;

public class Demo6_stringMethod {

	/**
	 *  String replace(char oldChar, char newChar) 
          返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 而生成的。 
          
        String replace(CharSequence target, CharSequence replacement) 
          使用指定的字面值替换序列替换此字符串匹配字面值目标序列的每个子字符串   
          
           String trim() 
          返回字符串的副本，忽略前导空白和尾部空白。 
          
           int compareTo(String anotherString) 
          按字典顺序比较两个字符串。 
 int compareToIgnoreCase(String str) 
          不考虑大小写，按字典顺序比较两个字符串。 

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
