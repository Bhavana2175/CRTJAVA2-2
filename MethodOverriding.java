class Parent
{
	void surname()
	{
		System.out.println("L");
	}
	void designation()
	{
		System.out.println("field officer");
	}
}
class Child extends Parent
{
	void designation()
	{
		System.out.println("Java Programmer");
	}
}
class MethodOverriding
{
	public static void main(String[] args)
	{
		Child c1=new Child();
		c1.surname();
		c1.designation();
	}
}