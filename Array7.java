import java.util.*;
public class Array7
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
		int a[],n,i,big;
		System.out.println("Enter size of an array");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter n elements");
	    for(i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();  
	    }
	   big=a[0];
	   for(i=1;i<n;i++)
	   {
	       if(big<a[i])
	       {
	           big=a[i];
	       }
	   }
	   System.out.println("Biggest elements="+big);
	   
	}
}
 