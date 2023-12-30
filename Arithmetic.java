import java.util.*;

public class Arithmetic 

{
    
public static void main(String[] args)
    
{
        
Scanner s=new Scanner(System.in);
        
int a,b,r;
        
System.out.println("Enter 2 nos");
        
a=s.nextInt();
        
b=s.nextInt();
        
System.out.println("1.Addition\n2.Subration\n3.Multiply\n4.Division");
        
System.out.println("Enter your choice");
        
int ch=s.nextInt();
        
switch(ch)
        
{
            
case 1:
                
r=a+b;
                
System.out.println("Addition"+r);
            
break;
            
case 2:
                
r=a-b;
                
System.out.println("Subration"+r);
            
break;
            
case 3:
                
r=a*b;
                
System.out.println("Multiply"+r);
            
break;
            
case 4:
                
r=a/b;
                
System.out.println("Division"+r);
            
break;
            
default:
            
{
                
System.out.println("Invalid");
            
}
        
}
        
    
}
    

}