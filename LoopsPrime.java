import java.util.*;

class LoopsPrime 

{
    
public static void main(String ags[])
    
{
        
Scanner s=new Scanner(System.in);
        
int n,i,j;
        
n=s.nextInt();
     
for(i=1;i<+n;i++)
        
{
        
for(j=2;j<i;j++)
           
{
               
if(i%j==0)
               
break;
           
}
           
if(j==i)
           
System.out.print(i+" ");
        
}
    
}

}