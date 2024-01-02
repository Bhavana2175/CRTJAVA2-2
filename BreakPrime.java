import java.util.*;

class BreakPrime 

{
    
public static void main(String args[])
    
{
        
Scanner s=new Scanner(System.in);
        
int i,n;
        
n=s.nextInt();
        
for(i=2;i<n;i++)
        
{
            
if(n%i==0)
                
break;
                
        
}
            
System.out.println(i);
            
if(i==n)
            
System.out.println("Prime no");
            
else
            
System.out.println("Not a prime no");
        
    
}

}