package pack2;
import pack1.First;
public class Fourth extends First
{
	public void show4()
	{
		First f1=new First();
		//System.out.println("Private a="+a);
		//System.out.println("Default b="+b);
		System.out.println("Protected c="+c);
		System.out.println("Public d="+d);
	}
	public static void main(String[] args)
	{
		Fourth f2=new Fourth();
		f2.show4();
	}
} 