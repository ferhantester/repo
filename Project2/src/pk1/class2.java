package pk1;

public class class2 extends class1
{
	public class2()
	{
		System.out.println("default child constructor");
	}
	public class2(int a)
	{
		
		System.out.println("child parameterized constructor");
	}
	public class2(int a,int b)
	{
		super(1);
		System.out.println("child parameterized 2 constructor");
	}
	
	public static void main(String[] args) 
	{
		class2 obj=new class2(1,2);
		
		
	}
}
