class This
{
    int admno;
    String name;
    void get(int admno, String name)
    {
        this.admno=admno;
        this.name=name;
    }
    void show()
    {
        System.out.println("Admno="+admno+"Name="+name);
    }
    public static void main(String[] args)
    {
        This s1=new This();
        s1.get(222,"rrr");
        s1.show();
        This s2=new This();
        s2.get(666,"kkk");
        s2.show();
    }
}