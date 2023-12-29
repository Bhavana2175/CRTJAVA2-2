import java.util.*;
class Nested
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 3 nos:");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	if(a>b)
	{
		if(a>c)
		{
			System.out.println(a+" is biggest");
		}
		else
		{
			System.out.println(c+" is biggest");
		}
	}
		else
		if(b>c)
		{
			System.out.println(b+" is biggest");
		}
		else
		{
			System.out.println(c+" is biggest");
		}
	
	}


}
