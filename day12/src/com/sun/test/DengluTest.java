package com.sun.test;

import java.util.Scanner;


public class DengluTest {

	/**
	 * 分析：
	 * 1：用户名密码都是admin
	 * 2：键盘录入
	 * 3：有3次机会，还剩几次机会
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//键盘录入
		for(int i = 0; i < 3; i++){
			System.out.println("请输入用户名:");
			String username = sc.nextLine();//用户名
			System.out.println("请输入密码:");
			String password = sc.nextLine();//密码
			if("admin".equals(username) && "admin".equals(password)){
				System.out.println("登录成功");
				break;//跳出循环
			}else{
				if(i == 2){	
					System.out.println("用户名或密码错误，请明天再登录吧");
				}else{
					System.out.println("用户名或密码错误，还有"+(2-i)+"次机会");
				}
				
				
			}
		}
	}

}
