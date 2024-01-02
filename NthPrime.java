import java.util.*;

class NthPrime 

{
    
public static void main(String args[])
    
{
        
Scanner s=new Scanner(System.in);
        
int n,i,j,c=0;
        
n=s.nextInt();
        
i=1;
        
for(;;)
        
{
           
for(j=2;j<i;j++)
           
{
               
if(i%j==0)
               
break;
           
}
           
if(j==i)
           
c=c+1;
           
if(c==n)
           
{
           
System.out.print(i);
           
break;
           
}
        
i=i+1;
        
}
    
}

}