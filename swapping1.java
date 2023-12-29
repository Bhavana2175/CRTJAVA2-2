
                        SWAPPING WITHOUT STORING

import java.util.*;

class  Swapping1
{
    
public static void main (String[] args) 
    
{
        
int a,b;
        
Scanner s=new Scanner(System.in);
        
System.out.println("Enter two values:");
        
a=s.nextInt();
        
b=s.nextInt();
        
System.out.println("Values of swapping:"+a+" "+b);
        
a=a+b;
        
b=a-b;
        
a=a-b;
        
System.out.println("Avalues after swapping:"+a+" "+b);
    
}

}