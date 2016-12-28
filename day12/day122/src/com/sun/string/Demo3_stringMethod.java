package com.sun.string;

public class Demo3_stringMethod {

	/**
	 * byte[] getBytes() 
          使用平台默认的字符集将此 String 解码为字节序列，并将结果存储到一个新的字节数组中。 
          
          char[] toCharArray() 
          将此字符串转换为一个新的字符数组。
           
          static String valueOf(char[] data) 
          返回 char 数组参数的字符串表示形式
          。 
          static String valueOf(int i) 
          返回 int 参数的字符串表示形式。 
          
          String toLowerCase() 
          使用默认语言环境的规则将此 String 中的所有字符都转换为小写。 
          
           String concat(String str) 
          将指定字符串联到此字符串的结尾。 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "孙斌";
		byte[] c1 = s1.getBytes();
		for (int i = 0; i < c1.length; i++) {
			//System.out.print(c1[i]+" ");
		}
		
		String s2 = "sunbin";
		char[] arr2 = s2.toCharArray();
		for (int i = 0; i < arr2.length; i++) {
			//System.out.print(arr2[i]+" ");
		}
		
		char[] arr3 = {'a','b','c'};
		String str = String.valueOf(arr3);
		//System.out.println(str);
		
		String str2 = String.valueOf(100);
		//System.out.println(str2+"200");
		
		String str3 = "huihuAADDAD";
		String str4 = str3.toLowerCase(); //有返回值的
		//System.out.println(str4);
		
		String str5 = "bin";
		System.out.println(str5.concat("sun"));//只能和字符串类型的连接
		System.out.println(str5+"yang");//更强大，可以和任何类型的数据连接
	}

}
