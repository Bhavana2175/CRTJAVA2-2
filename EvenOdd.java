import java.util.*;
class EvenOdd
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int a;
	System.out.println("Enter a value:");
	a=s.nextInt();
	
	if(a%2==0)
		{
		System.out.println("The given number is Even");
		}
		else
		{
		System.out.println("The given number is Odd");
		}
	}
}
