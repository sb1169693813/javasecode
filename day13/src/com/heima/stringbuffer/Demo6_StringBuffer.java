package com.heima.stringbuffer;

public class Demo6_StringBuffer {

	/**
	 * * A:String -- StringBuffer
		* a:通过构造方法
		* b:通过append()方法
	* B:StringBuffer -- String
		* a:通过构造方法
		* b:通过toString()方法
		* c:通过subString(0,length);

	 */
	public static void main(String[] args) {
		//demo1();
//		B:StringBuffer -- String

		
//		* a:通过构造方法
		StringBuffer sb = new StringBuffer("sunbin");
		//String str = new String(sb);
		//System.out.println(str);
		
//		* b:通过toString()方法
//		 String str2 =  sb.toString();
//		 System.out.println(str2);
		 
//			* c:通过subString(0,length);
		 	String str3 = sb.substring(0, sb.length());
		 	System.out.println(str3);

	}

	private static void demo1() {
		//A:String -- StringBuffer
		StringBuffer sb = new StringBuffer("sunbin");//通过构造方法
		
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("sunbin");  //通过append()方法
	}

	
}
