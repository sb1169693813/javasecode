
/*
class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		pd.method(new Person(){
			public  void show(){
				System.out.println("show");
			}
		});
	}
}

//����д�����࣬�ӿڶ���
abstract class Person {
	public abstract void show();
}
class PersonDemo{
	public void method(Person p) {
		p.show();
	}
}
*/


//Ҫ���ڿ���̨�����HelloWorld��
class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		  Outer.method().show();
	  }
}

interface Inter { 
	void show(); 
	}
class Outer { 
	//������� 
		public static Inter method(){
			return new Inter(){
				public void show(){
					System.out.println("HelloWorld");
				}
			};
		}
	}
