package com.heima.stringbuffer;

public class Demo6_StringBuffer {

	/**
	 * * A:String -- StringBuffer
		* a:ͨ�����췽��
		* b:ͨ��append()����
	* B:StringBuffer -- String
		* a:ͨ�����췽��
		* b:ͨ��toString()����
		* c:ͨ��subString(0,length);

	 */
	public static void main(String[] args) {
		//demo1();
//		B:StringBuffer -- String

		
//		* a:ͨ�����췽��
		StringBuffer sb = new StringBuffer("sunbin");
		//String str = new String(sb);
		//System.out.println(str);
		
//		* b:ͨ��toString()����
//		 String str2 =  sb.toString();
//		 System.out.println(str2);
		 
//			* c:ͨ��subString(0,length);
		 	String str3 = sb.substring(0, sb.length());
		 	System.out.println(str3);

	}

	private static void demo1() {
		//A:String -- StringBuffer
		StringBuffer sb = new StringBuffer("sunbin");//ͨ�����췽��
		
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("sunbin");  //ͨ��append()����
	}

	
}
