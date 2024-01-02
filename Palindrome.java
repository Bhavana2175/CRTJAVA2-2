import java.util.*;

public class Palindrome

{
	
public static void main(String[] args) 
{
	
Scanner s=new Scanner(System.in);
	
System.out.println("Enter a value");
	
int num,temp,rev=0,digit;
    
num=s.nextInt();
    
temp=num;
    
while(temp>0)
    
{
        
digit=temp%10;
        
rev=rev*10+digit;
        
temp=temp/10;
    
}
    
if(num==rev)
    
{
        
System.out.println("Palindrome");
    
}
    
else
    
{
        
System.out.println("Not a Palindrome");
    
}
	
}

}
