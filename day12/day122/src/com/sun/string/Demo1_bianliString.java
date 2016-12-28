package com.sun.string;

public class Demo1_bianliString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char charAt(int index) 
        返回指定索引处的 char 值。 */
		String str = "heima";
		for(int i = 0;i < str.length();i++){
			System.out.print(str.charAt(i));
		}
	}

}
