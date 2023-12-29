import java.util.*;
class Smallest
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 3 nos:");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	if(b<a && b<c)
		{
		System.out.println(a+" is smallest");
		}
		else
		if(b<c)
		{
			System.out.println(b+" is smallest");
		}
		else
		{
			System.out.println(c+" is smallest");
		}
	}
}
