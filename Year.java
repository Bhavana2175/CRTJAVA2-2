import java.util.*;
class Year
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int a;
	System.out.println("Enter the year");
	a=s.nextInt();
	if(a%4==0 && (a%100!=0 || a%400==0))
		{
		System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}
