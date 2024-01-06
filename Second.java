package pack1;
import pack1.First
class Second extends First
{
	void show2()
	{
		//System.out.println("Private a="+a);
		System.out.println("Default b="+b);
		System.out.println("Protected c="+c);
		System.out.println("Public d="+d);
	}
	public static void main(String[] args)
	{
		Second s1=new Second();
		s1.show2();
	}
}