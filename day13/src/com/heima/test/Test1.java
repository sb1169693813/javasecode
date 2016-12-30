package com.heima.test;

public class Test1 {

	/**
	 * * 需求：把数组中的数据按照指定个格式拼接成一个字符串
	* 
			举例：
				int[] arr = {1,2,3};	
			输出结果：
				"[1, 2, 3]"
				
			用StringBuffer的功能实现
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		StringBuffer sb = new StringBuffer("[");
		//遍历数组，每一个添加
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1){
				 //最后一个数组元素
				sb.append(arr[i] +"]");
			}else{
				sb.append(arr[i] +", ");
			}
		}
		System.out.println(sb);
	}

}
