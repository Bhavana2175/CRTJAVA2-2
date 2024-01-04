class Samplee2
{
    int a=10;
    static int b=20;
    void m1()
    {
        System.out.println("a="+a+" b="+b);
    }
    static void m2()
    {
        Samplee2 s=new Samplee2();
        System.out.println("a="+s.a+" b="+b);
    }
    public static void main(String[] args)
    {
        Samplee2 s1=new Samplee2();
        s1.m1();
        s1.m2();
    }
}