import java.util.*;
class Biggest
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a value:");
        a=s.nextInt();
		System.out.println("Enter b value:");
		b=s.nextInt();
		if(a>b)
		{
			System.out.println(a+" is biggest");
		}
		else
		{
			System.out.println(b+" is biggest");
		}
	}
}
