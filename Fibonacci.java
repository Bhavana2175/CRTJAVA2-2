import java.util.*;

public class Fibonacci

{
	
public static void main(String[] args) 
	
{
	
Scanner s=new Scanner(System.in);
	
int n,i,n1=0,n2=1,n3;
	
n=s.nextInt();
	
System.out.println(n1+" "+n2+" ");
	
for(i=1;i<=n-2;i++)
	    
{
	        
n3=n1+n2;
	    
System.out.println(n3+" ");
	    
n1=n2;
	    
n2=n3;
	    
}
	
}

}