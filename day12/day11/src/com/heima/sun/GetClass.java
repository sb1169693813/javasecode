package com.heima.sun;

import com.heima.eclipse.HellowWorld;



public class GetClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HellowWorld hw = new HellowWorld("sun",18);
		Class cla = hw.getClass();// ����һ�����������ʱ��
		String name = cla.getName(); // �� String ����ʽ���ش� Class ��������ʾ��ʵ�壨�ࡢ�ӿڡ������ࡢ�������ͻ� void�����ơ�
		//System.out.println(name);
		//System.out.println(hw.toString());
		
		//boolean equals(Object obj) ָʾĳ�����������Ƿ���˶�����ȡ��� 
		HellowWorld hw2 = new HellowWorld("sun",18);
		//System.out.println(hw.equals(hw2));//�Ƚϵ��ǵ�ֵַ��û�����壬Ҫ��д
		System.out.println(hw.equals(hw2));
	}

}
