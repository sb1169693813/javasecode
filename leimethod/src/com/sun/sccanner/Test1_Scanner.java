package com.sun.sccanner;

import java.util.Scanner;

public class Test1_Scanner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����:");
		//method1(sc);
		//method2(sc);
		String str1 = sc.nextLine();
		System.out.println("������һ����:");
		String str2 = sc.nextLine();
		System.out.println(str1 +  "     "+str2);
	}

	private static void method2(Scanner sc) {
		int i1 = sc.nextInt();
		System.out.println("������һ����:");
		String str = sc.nextLine();        //���յ����ַ���
		System.out.println(i1 +  "     "+str);
	}

	private static void method1(Scanner sc) {
		//boolean hasNextInt() ���ͨ��ʹ�� nextInt() ��������ɨ����������Ϣ�е���һ����ǿ��Խ���ΪĬ�ϻ����е�һ�� int ֵ���򷵻� true�� 
		if(sc.hasNextInt()){
			int i = sc.nextInt();
			System.out.println(i);
		}else{
			System.out.println("����ı��������֣�");
		}
	}

}
