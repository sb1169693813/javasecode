package com.sun.demo2;

import com.sun.demo1.Student;

public class Test_Object {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("sunbin",25);
		/* 
		int hashCode() 
         ���ظö���Ĺ�ϣ��ֵ�� 
		*/
		int hash = s.hashCode();
		//System.out.println(hash);
		
		// Class<? extends Object> getClass() ����һ�����������ʱ�ࡣ 
		//String getName() �� String ����ʽ���ش� Class ��������ʾ��ʵ�壨�ࡢ�ӿڡ������ࡢ�������ͻ� void�����ơ� 
		String name = s.getClass().getName();
		//System.out.println(name);
		
		/*
		 *  String toString() 
         * 	���ظö�����ַ�����ʾ��ͨ����toString �����᷵��һ�������ı���ʽ��ʾ���˶�����ַ��������Ӧ��һ�����������ڶ����������������඼��д�˷�����  
         * com.sun.demo1.Student@e3c624
         * getClass().getName() + '@' + Integer.toHexString(hashCode())
		*/
		String str = s.toString();
		//System.out.println(str);
		
		/*
		 *  boolean equals(Object obj) 
          	ָʾĳ�����������Ƿ���˶�����ȡ��� 
		 * Ĭ������±Ƚϵ��Ƕ���������Ƿ���ͬ��
		 * ���ڱȽ϶��������û�����壬һ�㽨����д�÷�����
		 * ==��һ���Ƚ��������,�ȿ��ԱȽϻ�����������,Ҳ���ԱȽ�������������,�����������ͱȽϵ���ֵ,�����������ͱȽϵ��ǵ�ֵַ
		 * equals������һ������,ֻ�ܱȽ�������������,���еĶ��󶼻�̳�Object���еķ���,���û����дObject���е�equals����,
		 * equals������==�űȽ�������������������,��д���equals�����Ƚϵ��Ƕ����е�����
		 * */
		Student s2 = new Student("sunbin",26);
		System.out.println(s.equals(s2));
		
	}

}
