class Addition
{
	void add(int... a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
class VarArgAdd
{
	public static void main(String args[])
	{
		Addition a1=new Addition();
		a1.add(21,35);
		a1.add(10);
		a1.add(33,24,14,7,51,77,81);
		a1.add();
	}
}