class Sample9
{
    void m1()
    {
        System.out.println("m1 method");
    }
    Sample9()
    {
        System.out.println("Constructor");
    }
    public static void main(String[] args)
    {
        Sample9 s1=new Sample9();
        Sample9 s2=new Sample9();
        s1.m1();
    }
}