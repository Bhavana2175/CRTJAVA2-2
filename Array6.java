import java.util.*;
public class Array6
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
		int i,a[],n,sum=0;
		float avg;
		System.out.println("Enter size of an array");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter n elements");
	    for(i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	        
	    }
	    for(i=0;i<n;i++)
	    {
	        sum=sum+a[i];
	    }
	    avg=(float)sum/n;
	    System.out.println("Sum of elements="+sum);
	    System.out.println("Average="+avg);
	}
}
 