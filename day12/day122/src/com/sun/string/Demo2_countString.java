package com.sun.string;

public class Demo2_countString {

	/**
	 * ����ͳ��һ���ַ����д�д��ĸ��Сд��ĸ�����֣������ַ����ֵĴ���
	 * �������ַ������ַ���ɵģ��ַ����з�Χ�ģ�ͨ���жϵó��Ƿ��������ַ����ڼ���
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
		System.out.println("��д��ĸ�ĸ�����"+big+",Сд��ĸ�ĸ���:"+small+",���ֵĸ���:"+num+"�����ַ��ĸ���:"+other);
	}

}
