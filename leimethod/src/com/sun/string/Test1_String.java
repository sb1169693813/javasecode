package com.sun.string;

public class Test1_String {

	/**
String(StringBuffer buffer) 
          分配一个新的字符串，它包含当前包含在字符串缓冲区参数中的字符序列。 
String(StringBuilder builder) 
          分配一个新的字符串，它包含当前包含在字符串生成器参数中的字符序列。 
	 */
	public static void main(String[] args) {
		 // gouzao();
		
		//1:char charAt(int index) ：取字符串中的某一个字符，其中的参数index指的是字符串中序数。字符串的序数从0开始到length()-1 。
	      String str1 = "abcdefghijklmnopqrstuvwxyz";
	      char ch1 = str1.charAt(1);
	      //System.out.println(ch1);
	      	
	     //2:int compareTo(String anotherString) 
	      //：当前String对象与anotherString比较。相等关系返回０；不相等时，从两个字符串第0个字符开始比较，返回第一个不相等的字符差，
	      //另一种情况，较长字符串的前面部分恰巧是较短的字符串，返回它们的长度差。
	     int compare =  "abcdefghijkl".compareTo("abcdefghijklmnopqrstuvwxyz");
	      //System.out.println(compare);//-14  m
	      
	      /*3:int compareTo(Object o) ：如果o是String对象，和2的功能一样；否则抛出ClassCastException异常。
	             结果为：s1.compareTo(s2): 4
	                         s1.compareTo(s3): 10*/
	     String s1 = new String("abcdefghijklmn");
         String s2 = new String("abcdefghij");
        String s3 = new String("abcdefghijalmn");
        //System.out.println("s1.compareTo(s2): " + s1.compareTo(s2) ); //返回长度差
       // System.out.println("s1.compareTo(s3): " + s1.compareTo(s3) ); //返回'k'-'a'的差
	      
        //8. boolean endsWith(String suffix) ：该String对象是否以suffix结尾。
        		String str2 = new String("abcdefghij");
               String str3 = new String("ghij");
             //  System.out.println("str2.endsWith(str3): " + str2.endsWith(str3) );
        //       结果为：s1.endsWith(s2): true
               
        // 9. boolean equals(Object anObject) ：当anObject不为空并且与当前String对象一样，返回true；否则，返回false。
        String str4 = new String("abcd");
        String str5 = new String("abcdg");
        boolean be = str4.equals(str5);
        //System.out.println(be);
        
       // 15. int indexOf(String str) ：只找第一个匹配字符串位置
        String str6 = new String("sunbinsunbin");
        int index = str6.indexOf('s');
       // System.out.println(index);
        
        /*
        12. int hashCode() ：返回当前字符的哈希表码。
        13. int indexOf(int ch) ：只找第一个匹配字符位置。
        14. int indexOf(int ch, int fromIndex) ：从fromIndex开始找第一个匹配字符位置。
        15. int indexOf(String str) ：只找第一个匹配字符串位置。
        16. int indexOf(String str, int fromIndex) ：从fromIndex开始找第一个匹配字符串位置。
              例如：String s = new String("write once, run anywhere!");
                      String ss = new String("run");
                      System.out.println("s.indexOf('r'): " + s.indexOf('r') );
                      System.out.println("s.indexOf('r',2): " + s.indexOf('r',2) );
                      System.out.println("s.indexOf(ss): " + s.indexOf(ss) );
                      结果为：s.indexOf('r'): 1
                              s.indexOf('r',2): 12
                              s.indexOf(ss): 12
        17. int lastIndexOf(int ch)
        18. int lastIndexOf(int ch, int fromIndex)
        19. int lastIndexOf(String str)
        20. int lastIndexOf(String str, int fromIndex) 以上四个方法与13、14、15、16类似，不同的是：找最后一个匹配的内容。
        */
        
       // 21. int length() ：返回当前字符串长度。
        String str7 = new String("agdkjgsf");
        //System.out.println(str7.length());//是方法，数组的那个是属性
        
        //22. String replace(char oldChar, char newChar) ：将字符号串中第一个oldChar替换成newChar。
        String str8 = new String("sunbin");
        String str9 = str8.replace('s', 'a');
       // System.out.println(str9);
        
       // 23. boolean startsWith(String prefix) ：该String对象是否以prefix开始。
        String str10 = new String("sunbin");
        boolean be2 = str10.startsWith("un");
        //System.out.println(be2);
        
       // 26.String substring(int beginIndex, int endIndex) ：取从beginIndex位置开始到endIndex位置的子字符串。
        String str11 = new String("sunbin");
        String str12 = str11.substring(0, 2);//0<=去的字符串<2
       // System.out.println(str12);
        
       // 27. char[ ] toCharArray() ：将该String对象转换成char数组。
        String str13 = new String("sunbin");
        char[] toChar = str13.toCharArray();
        for(int j = 0;j<toChar.length;j++){
        	//System.out.println(toChar[j]);
        }
        
//        28. String toLowerCase() ：将字符串转换成小写。
//        29. String toUpperCase() ：将字符串转换成大写
        
       /* public String[] split(String regex)
        将一个字符串按照指定的分隔符分隔，返回分隔后的字符串数组*/
        String date = "2008/09/10";
        String[ ] dateAfterSplit= new String[3];
        dateAfterSplit=date.split("/");         //以“/”作为分隔符来分割date字符串，并把结果放入3个字符串中。
        for(int i=0;i<dateAfterSplit.length;i++){
                   System.out.print(dateAfterSplit[i]+" ");
        }
        
        
	}

	public static void gouzao() {
		byte[] b = {'a','b','c','d','e','f','g','h','i','j'};
	      char[] c = {'0','1','2','3','4','5','6','7','8','9'};
	     /* String(byte[] bytes) 
          构造一个新的 String，方法是使用平台的默认字符集解码字节的指定数组。*/
	      String sb = new String(b);                 //abcdefghij
	      
	      /*String(byte[] bytes, int offset, int length) 
          构造一个新的 String，方法是使用指定的字符集解码字节的指定子数组。*/
	      String sb_sub = new String(b,3,2);     //de
	      
	      /*String(char[] value) 
          分配一个新的 String，它表示当前字符数组参数中包含的字符序列。*/
	      String sc = new String(c);                  //0123456789
	      
	     /* String(char[] value, int offset, int count) 
          分配一个新的 String，它包含来自该字符数组参数的一个子数组的字符。*/
	      String sc_sub = new String(c,3,2);    //34
	      
	      /*String(String original) 
	        初始化一个新创建的 String 对象，表示一个与该参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的一个副本。 */
	      String sb_copy = new String(sb);       //abcdefghij  
	      
	     // System.out.println("sb:"+sb);
	      //System.out.println("sb_sub:"+sb_sub);
	     // System.out.println("sc:"+sc);
	    //  System.out.println("sc_sub:"+sc_sub);
	   //   System.out.println("sb_copy:"+sb_copy);
	}
}
