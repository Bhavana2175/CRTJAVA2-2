
                            SWAPPING WITH STORING

import java.util.*;

class  Swapping
{
    
public static void main (String[] args) 
    
{
        
int a,b;
        
Scanner s=new Scanner(System.in);
        
System.out.println("Enter two values:");
        
a=s.nextInt();
        
b=s.nextInt();
        
System.out.println("Values of swapping:"+a+" "+b);
        
int c=a;
        
int d=b;
        
a=d;
        
b=c;
        
System.out.println("Avalues after swapping:"+a+" "+b);
    
}

}