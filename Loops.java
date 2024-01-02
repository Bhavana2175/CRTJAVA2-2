import java.util.*;

class Loops 

{
    
public static void main(String args[])
    
{
        
Scanner s=new Scanner(System.in);
        
int n,d,r,i,x;
        
n=s.nextInt();
        
for(i=1;i<+n;i++)
        
{
            
x=i;
            
r=0;
            
while(x>0)
            
{
               
d=x%10;
                
x=x/10;
                
r=r*10+d;
            
}
            
if(r==i)
            
{
                
System.out.println(i+" ");
            
}
        
}
    
}

}