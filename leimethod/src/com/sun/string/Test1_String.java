package com.sun.string;

public class Test1_String {

	/**
String(StringBuffer buffer) 
          ����һ���µ��ַ�������������ǰ�������ַ��������������е��ַ����С� 
String(StringBuilder builder) 
          ����һ���µ��ַ�������������ǰ�������ַ��������������е��ַ����С� 
	 */
	public static void main(String[] args) {
		 // gouzao();
		
		//1:char charAt(int index) ��ȡ�ַ����е�ĳһ���ַ������еĲ���indexָ�����ַ������������ַ�����������0��ʼ��length()-1 ��
	      String str1 = "abcdefghijklmnopqrstuvwxyz";
	      char ch1 = str1.charAt(1);
	      //System.out.println(ch1);
	      	
	     //2:int compareTo(String anotherString) 
	      //����ǰString������anotherString�Ƚϡ���ȹ�ϵ���أ��������ʱ���������ַ�����0���ַ���ʼ�Ƚϣ����ص�һ������ȵ��ַ��
	      //��һ��������ϳ��ַ�����ǰ�沿��ǡ���ǽ϶̵��ַ������������ǵĳ��Ȳ
	     int compare =  "abcdefghijkl".compareTo("abcdefghijklmnopqrstuvwxyz");
	      //System.out.println(compare);//-14  m
	      
	      /*3:int compareTo(Object o) �����o��String���󣬺�2�Ĺ���һ���������׳�ClassCastException�쳣��
	             ���Ϊ��s1.compareTo(s2): 4
	                         s1.compareTo(s3): 10*/
	     String s1 = new String("abcdefghijklmn");
         String s2 = new String("abcdefghij");
        String s3 = new String("abcdefghijalmn");
        //System.out.println("s1.compareTo(s2): " + s1.compareTo(s2) ); //���س��Ȳ�
       // System.out.println("s1.compareTo(s3): " + s1.compareTo(s3) ); //����'k'-'a'�Ĳ�
	      
        //8. boolean endsWith(String suffix) ����String�����Ƿ���suffix��β��
        		String str2 = new String("abcdefghij");
               String str3 = new String("ghij");
             //  System.out.println("str2.endsWith(str3): " + str2.endsWith(str3) );
        //       ���Ϊ��s1.endsWith(s2): true
               
        // 9. boolean equals(Object anObject) ����anObject��Ϊ�ղ����뵱ǰString����һ��������true�����򣬷���false��
        String str4 = new String("abcd");
        String str5 = new String("abcdg");
        boolean be = str4.equals(str5);
        //System.out.println(be);
        
       // 15. int indexOf(String str) ��ֻ�ҵ�һ��ƥ���ַ���λ��
        String str6 = new String("sunbinsunbin");
        int index = str6.indexOf('s');
       // System.out.println(index);
        
        /*
        12. int hashCode() �����ص�ǰ�ַ��Ĺ�ϣ���롣
        13. int indexOf(int ch) ��ֻ�ҵ�һ��ƥ���ַ�λ�á�
        14. int indexOf(int ch, int fromIndex) ����fromIndex��ʼ�ҵ�һ��ƥ���ַ�λ�á�
        15. int indexOf(String str) ��ֻ�ҵ�һ��ƥ���ַ���λ�á�
        16. int indexOf(String str, int fromIndex) ����fromIndex��ʼ�ҵ�һ��ƥ���ַ���λ�á�
              ���磺String s = new String("write once, run anywhere!");
                      String ss = new String("run");
                      System.out.println("s.indexOf('r'): " + s.indexOf('r') );
                      System.out.println("s.indexOf('r',2): " + s.indexOf('r',2) );
                      System.out.println("s.indexOf(ss): " + s.indexOf(ss) );
                      ���Ϊ��s.indexOf('r'): 1
                              s.indexOf('r',2): 12
                              s.indexOf(ss): 12
        17. int lastIndexOf(int ch)
        18. int lastIndexOf(int ch, int fromIndex)
        19. int lastIndexOf(String str)
        20. int lastIndexOf(String str, int fromIndex) �����ĸ�������13��14��15��16���ƣ���ͬ���ǣ������һ��ƥ������ݡ�
        */
        
       // 21. int length() �����ص�ǰ�ַ������ȡ�
        String str7 = new String("agdkjgsf");
        //System.out.println(str7.length());//�Ƿ�����������Ǹ�������
        
        //22. String replace(char oldChar, char newChar) �����ַ��Ŵ��е�һ��oldChar�滻��newChar��
        String str8 = new String("sunbin");
        String str9 = str8.replace('s', 'a');
       // System.out.println(str9);
        
       // 23. boolean startsWith(String prefix) ����String�����Ƿ���prefix��ʼ��
        String str10 = new String("sunbin");
        boolean be2 = str10.startsWith("un");
        //System.out.println(be2);
        
       // 26.String substring(int beginIndex, int endIndex) ��ȡ��beginIndexλ�ÿ�ʼ��endIndexλ�õ����ַ�����
        String str11 = new String("sunbin");
        String str12 = str11.substring(0, 2);//0<=ȥ���ַ���<2
       // System.out.println(str12);
        
       // 27. char[ ] toCharArray() ������String����ת����char���顣
        String str13 = new String("sunbin");
        char[] toChar = str13.toCharArray();
        for(int j = 0;j<toChar.length;j++){
        	//System.out.println(toChar[j]);
        }
        
//        28. String toLowerCase() �����ַ���ת����Сд��
//        29. String toUpperCase() �����ַ���ת���ɴ�д
        
       /* public String[] split(String regex)
        ��һ���ַ�������ָ���ķָ����ָ������طָ�����ַ�������*/
        String date = "2008/09/10";
        String[ ] dateAfterSplit= new String[3];
        dateAfterSplit=date.split("/");         //�ԡ�/����Ϊ�ָ������ָ�date�ַ��������ѽ������3���ַ����С�
        for(int i=0;i<dateAfterSplit.length;i++){
                   System.out.print(dateAfterSplit[i]+" ");
        }
        
        
	}

	public static void gouzao() {
		byte[] b = {'a','b','c','d','e','f','g','h','i','j'};
	      char[] c = {'0','1','2','3','4','5','6','7','8','9'};
	     /* String(byte[] bytes) 
          ����һ���µ� String��������ʹ��ƽ̨��Ĭ���ַ��������ֽڵ�ָ�����顣*/
	      String sb = new String(b);                 //abcdefghij
	      
	      /*String(byte[] bytes, int offset, int length) 
          ����һ���µ� String��������ʹ��ָ�����ַ��������ֽڵ�ָ�������顣*/
	      String sb_sub = new String(b,3,2);     //de
	      
	      /*String(char[] value) 
          ����һ���µ� String������ʾ��ǰ�ַ���������а������ַ����С�*/
	      String sc = new String(c);                  //0123456789
	      
	     /* String(char[] value, int offset, int count) 
          ����һ���µ� String�����������Ը��ַ����������һ����������ַ���*/
	      String sc_sub = new String(c,3,2);    //34
	      
	      /*String(String original) 
	        ��ʼ��һ���´����� String ���󣬱�ʾһ����ò�����ͬ���ַ����У����仰˵���´������ַ����Ǹò����ַ�����һ�������� */
	      String sb_copy = new String(sb);       //abcdefghij  
	      
	     // System.out.println("sb:"+sb);
	      //System.out.println("sb_sub:"+sb_sub);
	     // System.out.println("sc:"+sc);
	    //  System.out.println("sc_sub:"+sc_sub);
	   //   System.out.println("sb_copy:"+sb_copy);
	}
}
