import java.io.*;
import java.util.*;
class Property
{
	public static void main(String args[])throws Exception
	{
		int a,b,c;
		Properties p=new Properties();
		FileInputStream f1=new FileInputStream("data.txt");
		p.load(f1);
		a=Integer.parseInt(p.getProperty("num1"));
		b=Integer.parseInt(p.getProperty("num2"));
		c=a+b;
		System.out.println(c);
	}
}