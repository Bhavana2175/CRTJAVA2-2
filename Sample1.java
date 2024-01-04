class Sample1
{
int a,b;
void get()
{
a=10;
b=20;
}
void show()
{
System.out.println("a="+a+" b="+b);
}
public static void main(String[] args)
{
Sample1 s1=new Sample1();
Sample1 s2=new Sample1();
s1.get();
s2.get();
s1.show();
s2.show();
}
}