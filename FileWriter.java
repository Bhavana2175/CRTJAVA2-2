import java.io.*;
class FileWriter
{
	public static void main(String[] args)
	{
		FileWriter f1=new FileWriter("abc.txt");
		f1.write('d');
		f1.write(97);
		f1.write("\n");
		f1.write("Java");
		f1.write("\n");
		f1.write("Python");
		f1.flush();
		f1.close();
	}
