import java.util.*;
public class TwoDim
{
	public static void main(String[] args) 
	{
	 Scanner s=new Scanner(System.in);
	 int a[][]=new int[2][2];
	 int i,j;
	 System.out.println("Enter 4 elements");
	  for(i=0;i<2;i++)
	    {
	        for(j=0;j<2;j++)
	        {  
	          a[i][j]=s.nextInt();
	        }
	       
	    }
	 for(i=0;i<2;i++)
	    {
	        for(j=0;j<2;j++)
	        {  
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
