class First
{
void show(float x,float y)
	{
	System.out.println("two arg in float method");
	}
	void show(double d)
	{
		System.out.println("One arg in double method");
	}
}
class Tree
{
	public static void main(String[] args)
	{
		First f1=new First();
		f1.show(65.4);
		f1.show(35,34);
		f1.show(56.6f);
		//f1.show(55.6,76.8);
	}
}