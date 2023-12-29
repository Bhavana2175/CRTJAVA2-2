import java.util.*;

class Average
 
{

    public static void main(String[] args)

    {
        
       float a,b,c,d;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter three numbers");

        a=s.nextInt();

        b=s.nextInt();

        c=s.nextInt();

        d=(Float)(a+b+c)/3;

        System.out.println("Average of three numbers:"+d);

        System.out.printf("%. 2f",d);

    }

}