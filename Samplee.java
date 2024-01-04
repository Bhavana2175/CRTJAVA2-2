class Samplee
{
    void m1()
    {
        System.out.println("Instance method");
    }
    static void m2()
    {
        System.out.println("Static method");
    }
    public static void main(String[] args)
    {
        // Samplee.m1();
        Samplee.m2();
        Samplee s1=new Samplee();
        s1.m1();
        s1.m2();
    }
}