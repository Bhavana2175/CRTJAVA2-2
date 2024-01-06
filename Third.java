package pack1;
import pack1.First;
class Third
{
	void show3()
	{
		First f1=new First();
		//System.out.println("Private a="+a);
		System.out.println("Default b="+f1.b);
		System.out.println("Protected c="+f1.c);
		System.out.println("Public d="+f1.d);
	}
	public static void main(String[] args)
	{
		Third t1=new Third();
		t1.show3();
	}
}