                                       BOATS PROBLEM
import java.util.*;

class Boot
{
    
public static void main(String args[])
    
{
        
int w,a,c,d;
        
Scanner s=new Scanner(System.in);
        
w=600;
        
a=s.nextInt();
        
c=s.nextInt();
        
d=a*75+c*30;
        
if(w>=d)
        
{
            
System.out.println("Boat goes on");
        
}
        
else
{
            
System.out.println("Boat drowns");
       
}
    
}

}