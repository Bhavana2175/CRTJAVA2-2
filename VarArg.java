class First
{
	void show(double... x)
	{
		System.out.println("var arg method");
	}
	void show(double a, double b)
	{
		System.out.println("two arg double method");
	}
}
class VarArg
{
	public static void main(String[] args)
	{
		First f1=new First();
		f1.show(23.5,67.8);
		f1.show();
		f1.show(35,42,48,55,88,9);
	}
}