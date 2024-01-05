class First
{
	void m1()
	{
		System.out.println("m1 method is in first class");
	}
	void m2()
	{
		System.out.println("m2 method is in first class");
	}
}
class Second extends First
{
	void m3()
	{
		System.out.println("m3 method is in Second class");
	}
}
class Parent
{
	public static void main(String[] args)
	{
		Second s1=new Second();
		s1.m1();
		s1.m2();
		s1.m3();
	}
}
