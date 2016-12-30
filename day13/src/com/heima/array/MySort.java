package com.heima.array;

public class MySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {24, 69, 80, 57, 13};
		/*
		 * ѡ������
		 * 1,����ֵ����void
		 * 2,�����б�int[] arr
		 * 
		 * 	��һ��:arr[0]�ֱ���arr[1-4]�Ƚ�,�Ƚ�4��
			�ڶ���:arr[1]�ֱ���arr[2-4]�Ƚ�,�Ƚ�3��
			������:arr[2]�ֱ���arr[3-4]�Ƚ�,�Ƚ�2��
			���Ĵ�:arr[3]��arr[4]�Ƚ�,�Ƚ�1��
		 */
		//xuanzeSort(arr);
		
		/*
		 * ð������
		 * 1,����ֵ����,void
		 * 2,�����б�,int[] arr
		 * 
		 * 	��һ��:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3],arr[3]��arr[4]�Ƚ�4��
			�ڶ���:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3]�Ƚ�3��
			������:arr[0]��arr[1],arr[1]��arr[2]�Ƚ�2��
			���Ĵ�:arr[0]��arr[1]�Ƚ�1��
		 */
		maopaoSort(arr);
		
		print(arr);
	}

	private static void maopaoSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) { //�Ƚϴ���arr.length-1  i=0 i=3
			for (int j = 0; j <arr.length-1-i ; j++) {			//�Ƚϴ���
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} 
			}
		}
	}

	private static void print(int[] arr) {
		for(int i = 0; i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	private static void xuanzeSort(int[] arr) {
		for (int i = 0; i < arr.length -1; i++) { 	//i= 0 1 2 3 
			for (int j = i+1; j < arr.length; j++) { //j= 1-4 2-4 3- 4								
				//ǰ���  > ����� ����λ��
				if(arr[i] > arr[j]  ){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
