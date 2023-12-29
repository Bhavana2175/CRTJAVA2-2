import java.util.*;
class Div 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b,r;
		System.out.println("Enter a value:");
		a=s.nextInt();
		System.out.println("Enter b value:");
		b=s.nextInt();
			if(b==0)
		{
			System.out.println("Second number should notbe zero");
			b=1;
		}
		r=a/b;
		System.out.println("Division:"+r);
	}
}
