package com.sun.string;

public class Demo3_stringMethod {

	/**
	 * byte[] getBytes() 
          ʹ��ƽ̨Ĭ�ϵ��ַ������� String ����Ϊ�ֽ����У���������洢��һ���µ��ֽ������С� 
          
          char[] toCharArray() 
          �����ַ���ת��Ϊһ���µ��ַ����顣
           
          static String valueOf(char[] data) 
          ���� char ����������ַ�����ʾ��ʽ
          �� 
          static String valueOf(int i) 
          ���� int �������ַ�����ʾ��ʽ�� 
          
          String toLowerCase() 
          ʹ��Ĭ�����Ի����Ĺ��򽫴� String �е������ַ���ת��ΪСд�� 
          
           String concat(String str) 
          ��ָ���ַ����������ַ����Ľ�β�� 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "���";
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
		String str4 = str3.toLowerCase(); //�з���ֵ��
		//System.out.println(str4);
		
		String str5 = "bin";
		System.out.println(str5.concat("sun"));//ֻ�ܺ��ַ������͵�����
		System.out.println(str5+"yang");//��ǿ�󣬿��Ժ��κ����͵���������
	}

}
