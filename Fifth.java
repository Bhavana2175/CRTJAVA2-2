package pack2;
import pack1.First;
class Fifth
{
	void show5()
	{
		First f1=new First();
		//System.out.println("Private a="+a);
		//System.out.println("Default b="+b);
		//System.out.println("Protected c="+c);
		System.out.println("Public d="+f1.d);
	}
	public static void main(String[] args)
	{
		Fifth f3=new Fifth();
		f3.show5();
	}
}