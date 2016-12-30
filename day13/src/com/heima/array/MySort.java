package com.heima.array;

public class MySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {24, 69, 80, 57, 13};
		/*
		 * 选择排序
		 * 1,返回值类型void
		 * 2,参数列表int[] arr
		 * 
		 * 	第一次:arr[0]分别与arr[1-4]比较,比较4次
			第二次:arr[1]分别与arr[2-4]比较,比较3次
			第三次:arr[2]分别与arr[3-4]比较,比较2次
			第四次:arr[3]与arr[4]比较,比较1次
		 */
		//xuanzeSort(arr);
		
		/*
		 * 冒泡排序
		 * 1,返回值类型,void
		 * 2,参数列表,int[] arr
		 * 
		 * 	第一次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3],arr[3]与arr[4]比较4次
			第二次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3]比较3次
			第三次:arr[0]与arr[1],arr[1]与arr[2]比较2次
			第四次:arr[0]与arr[1]比较1次
		 */
		maopaoSort(arr);
		
		print(arr);
	}

	private static void maopaoSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) { //比较次数arr.length-1  i=0 i=3
			for (int j = 0; j <arr.length-1-i ; j++) {			//比较次数
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
				//前面的  > 后面的 交换位置
				if(arr[i] > arr[j]  ){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
