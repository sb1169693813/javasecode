package com.sun.test;

import java.util.Scanner;


public class DengluTest {

	/**
	 * ������
	 * 1���û������붼��admin
	 * 2������¼��
	 * 3����3�λ��ᣬ��ʣ���λ���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//����¼��
		for(int i = 0; i < 3; i++){
			System.out.println("�������û���:");
			String username = sc.nextLine();//�û���
			System.out.println("����������:");
			String password = sc.nextLine();//����
			if("admin".equals(username) && "admin".equals(password)){
				System.out.println("��¼�ɹ�");
				break;//����ѭ��
			}else{
				if(i == 2){	
					System.out.println("�û�������������������ٵ�¼��");
				}else{
					System.out.println("�û�����������󣬻���"+(2-i)+"�λ���");
				}
				
				
			}
		}
	}

}
