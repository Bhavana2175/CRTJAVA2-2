import java.util.*;

public class NumPrime

{

	
public static void main(String[] args) 
{
	
Scanner s=new Scanner(System.in);
	
int n,i,c=0;
	
n=s.nextInt();
	
for(i=1;i<=n;i++)
	
{
	    
if(n%i==0)
	    
c=c++;
	
}
	
if(c==2)
	    
System.out.println(n+"Prime number");
	
else 
	    
System.out.println(n+"Not a Prime number");
	
}

}
