class FirstYear
{
    void branch()
    {
        System.out.println("AI&DS");
    }
    void subjects()
    {
        System.out.println("C Python Maths Physics");
    }
	void backlogs()
	{
		System.out.println("Physics");
	}
}
class SecondYear
{
	void subjects()
	{
		FirstYear f1=new FirstYear();
		f1.branch();
		f1.backlogs();
		System.out.println("Java DS DBMS");
	}
}
class Inheritance
{
    public static void main(String[] args)
    {
        SecondYear s1=new SecondYear();
        s1.subjects();
    }
}