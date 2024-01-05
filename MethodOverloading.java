class First
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
		void add(int a,int b,int c)
		{
			System.out.println(a+b+c);
		}
}
class Second extends First
{
	void add(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
}
class MethodOverloading
{
	public static void main(String[] args)
	{
		Second s1=new Second();
		s1.add(25,26);
		s1.add(35,42,43);
		s1.add(99,29,47,11);
	}
}