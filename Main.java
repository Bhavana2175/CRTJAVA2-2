class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	MyThread t1=new MyThread();
	MyThread t2=new MyThread();
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	System.out.println(Thread.currentThread().getName());
	t1.setName("Bhavana");
	System.out.println(t1.getName());
	}
}
