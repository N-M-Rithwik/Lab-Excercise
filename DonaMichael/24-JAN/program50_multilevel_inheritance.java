class testA
{
	int a=10;
	}
class testB extends testA
{
	int b=5;
}
class testC extends testB
{
	int c;
	void display()
	{
		c=a+b;
		System.out.println(c);
	}
	}

public class program50_multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testC  obj=new testC();
		obj.display();
	}

}
