import java.util.*;
public class Array8
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
	    System.out.println("The elements before sorting");
	    for(i=0;i<n;i++)
	    {
	          System.out.print(a[i]+" ");
	    }
	 System.out.println();
	 Arrays.sort(a);  
	   System.out.println("The elements after sorting");
	   for(i=0;i<n;i++)
	    {
	          System.out.print(a[i]+" ");
	    }
	}
}
 