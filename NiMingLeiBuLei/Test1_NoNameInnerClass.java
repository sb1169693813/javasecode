
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

//这里写抽象类，接口都行
abstract class Person {
	public abstract void show();
}
class PersonDemo{
	public void method(Person p) {
		p.show();
	}
}
*/


//要求在控制台输出”HelloWorld”
class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		  Outer.method().show();
	  }
}

interface Inter { 
	void show(); 
	}
class Outer { 
	//补齐代码 
		public static Inter method(){
			return new Inter(){
				public void show(){
					System.out.println("HelloWorld");
				}
			};
		}
	}
