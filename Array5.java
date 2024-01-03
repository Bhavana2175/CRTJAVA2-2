import java.util.*;
public class Array5
{
	public static void main(String[] args) 
	{
		float a[]={34.5f,21.5f,55.9f};
		int i;
		for(float x:a)
		{
			System.out.print(x +" ");
		}
		System.out.println();
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
	}
}
 