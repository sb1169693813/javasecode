class DemoPhone 
{
	public static void main(String[] args) 
	{
		Phone p = new Phone();
		p.brand = "apple";
		p.price = 4567.67f;
		p.call();
	}
}

/*
###06.04_面向对象(手机类的定义)(掌握)
* 模仿学生类，让学生自己完成
	* 属性:品牌(brand)价格(price)
	* 行为:打电话(call),发信息(sendMessage)玩游戏(playGame)
*/
class Phone
{
	protected String brand;
	protected float price;

	public void call(){
		System.out.println("call  brand is "+this.brand);
	}

	public void sendMessage(){
		System.out.println("sendMessage");
	}

	public void playGame(){
		System.out.println("playGame");
	}

	public void print(Student s){
		
	}//print(new Student());如果你看到了一个方法的形式参数是一个类类型(引用类型)，这里其实需要的是该类的对象。
}
