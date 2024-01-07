import java.util.Scanner;

class CharArray

{
	
public static void main(String[] args) 
	
{
	    
Scanner s=new Scanner(System.in);
	    
String s1;
		
System.out.println("Enter a string");
		
s1=s.next();
		
char ch[]=s1.toCharArray();
		
int i;
		
for(i=0;i<s1.length();i++)
		
{
		    
System.out.println(ch[i]);
		
}
	
}

}
