import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
		int a[],n,i,sno;
		System.out.println("Enter size of an array");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter n elements");
	    for(i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	        
	    }
	    System.out.println("Enter Search element");
	    sno=s.nextInt();
	    int r=Arrays.binarySearch(a,sno);
	    if(r<0)
	    {
	        System.out.println("Search element is not found");
	    }
	    else
	    {
	        System.out.println("Search element is found\n Position");
	    }
	}
}
 