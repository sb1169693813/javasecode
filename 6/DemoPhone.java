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
###06.04_�������(�ֻ���Ķ���)(����)
* ģ��ѧ���࣬��ѧ���Լ����
	* ����:Ʒ��(brand)�۸�(price)
	* ��Ϊ:��绰(call),����Ϣ(sendMessage)����Ϸ(playGame)
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
		
	}//print(new Student());����㿴����һ����������ʽ������һ��������(��������)��������ʵ��Ҫ���Ǹ���Ķ���
}
