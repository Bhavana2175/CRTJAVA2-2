class Super
{
	int a=100;
	void show()
	{
		System.out.println("Super demo");
	}
}
class This extends Super 
{
	int a=256;
	void show(int a)
	{
		super.show();
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
class Method
{
	public static void main(String args[])
    {
		This t1=new This();
		t1.show(888);
	}
}