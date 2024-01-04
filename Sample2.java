public class Sample2
{
int a,b;
void get(int x, int y)
{
a=x;
b=y;
}
void show()
{
System.out.println("a="+a+" b="+b);
}
public static void main(String[] args)
{
Sample2 s1=new Sample2();
Sample2 s2=new Sample2();
s1.get(42,35);
s2.get(88,43);
s1.show();
s2.show();
}
}