package com.heima.test;

public class Test1 {

	/**
	 * * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
	* 
			������
				int[] arr = {1,2,3};	
			��������
				"[1, 2, 3]"
				
			��StringBuffer�Ĺ���ʵ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		StringBuffer sb = new StringBuffer("[");
		//�������飬ÿһ�����
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1){
				 //���һ������Ԫ��
				sb.append(arr[i] +"]");
			}else{
				sb.append(arr[i] +", ");
			}
		}
		System.out.println(sb);
	}

}
