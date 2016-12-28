package com.sun.sccanner;

import java.util.Scanner;

public class Test1_Scanner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数:");
		//method1(sc);
		//method2(sc);
		String str1 = sc.nextLine();
		System.out.println("请输入一个数:");
		String str2 = sc.nextLine();
		System.out.println(str1 +  "     "+str2);
	}

	private static void method2(Scanner sc) {
		int i1 = sc.nextInt();
		System.out.println("请输入一个数:");
		String str = sc.nextLine();        //接收的是字符串
		System.out.println(i1 +  "     "+str);
	}

	private static void method1(Scanner sc) {
		//boolean hasNextInt() 如果通过使用 nextInt() 方法，此扫描器输入信息中的下一个标记可以解释为默认基数中的一个 int 值，则返回 true。 
		if(sc.hasNextInt()){
			int i = sc.nextInt();
			System.out.println(i);
		}else{
			System.out.println("输入的必须是数字！");
		}
	}

}
