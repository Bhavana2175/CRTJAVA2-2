class Sample6
{
	int a=10;
	static int b=20;
	public static void main(String[] args)
	{
		Sample6 s1=new Sample6();
		Sample6 s2=new Sample6();
		System.out.println(s1.a+" "+s1.b);
		System.out.println(s2.a+" "+s2.b);
		s1.a=888;
		s2.b=999;
		System.out.println(s1.a+" "+s1.b);
		System.out.println(s2.a+" "+s2.b);
	}
}