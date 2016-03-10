import java.util.Scanner;
public class Sequences
{
    public void Pascal()
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("INPUT NUMBER OF ROWS");
        long x=scan.nextInt();
        if (x==0)
        {
            System.exit(0);
        }
        int[] A;
        int p=2;
        int m=1;
        A=new int[p];
        A[0]=1;
        A[1]=1;
        int[] B;
        B=new int[p];
        System.out.println("PASCAL TRIANGLE:");
        System.out.print("1");
        System.out.println("");
        System.out.println("1 1");
        for (p=3; p <= x; p++)
        {
            if ((p%2)==1)
            {
                B=new int[p];
                B[0]=1;
                System.out.print("1");
                for (m=1; m < (p-1); m++)
                {
                    B[m]=A[m-1]+A[m];
                    long v=B[m];
                    System.out.print(" "+v);
                }
                B[p-1]=1;
                System.out.print(" 1");
            }
            else
            {
                A=new int[p];
                A[0]=1;
                System.out.print("1");
                for (m=1; m < (p-1); m++)
                {
                    A[m]=B[m-1]+B[m];
                    long w=A[m];
                    System.out.print(" "+w);
                }
                A[p-1]=1; 
                System.out.print(" 1");
            }   
            System.out.println("");
        }
    }

    public void Fibonacci()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input the number of terms, of the fibonacci sequence, required");
        int x=scan.nextInt();
        int a=0;
        int b=1;
        int i;
        System.out.println("FIBONACCI SEQUENCE:");
        for (i=1; i <= x; i++)
        {
            if(i%2==0)
            {
                a=a+b;
                System.out.println(+a);
            }
            else
            {
                b=a+b;
                System.out.println(+b);
            }
        }
    }

    public void Palindrome()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("INPUT STARTING NUMBER:");
        int y=scan.nextInt();
        System.out.println("INPUT HOW MANY NUMBERS YOU WANT:");
        int z=scan.nextInt();
        int check=0;
        for (int b=0; check<z; b++)  
        {
            String x=String.valueOf(y);
            int count=x.length();
            int c=count/2;
            count=count-1;
            int n=0;
            for (int a=0; a<=c; a++)
            {
                if (x.charAt(a)==x.charAt(count-a))
                {
                }
                else
                {
                    n=1;
                    break;
                }
            }
            if (n==0)
            {
                System.out.println(+y);
                check=check+1;
            }
            y=y+1;
        }
    }
}
