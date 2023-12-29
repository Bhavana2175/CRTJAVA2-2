import java.util.*;
class Positive
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int a;
	System.out.println("Enter a value");
	a=s.nextInt();
	if(a>0)
		{
		System.out.println("The value is positive");
		}
		else
		if(a<0)
		{
		System.out.println("The value is negative");
		}
	else
		{
		System.out.println("The value is zero");
		}
	}
}
