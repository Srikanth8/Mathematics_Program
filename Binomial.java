import java.lang.Math;
import java.util.Scanner;
public class Binomial
{
    public void Binomial()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("(a+b)^n");
        System.out.println("");
        System.out.println("Enter value of n");
        int n=scan.nextInt();
        System.out.println("Enter value of a (variable such as x or y)");
        String a=scan.next();
        System.out.println("Enter value of b (numerical value)");
        int b=scan.nextInt();
        int x; int y; int z; int w;
        Combination C=new Combination();
        for (int k=0; k<=n; k++)
        {
            if (k==0 || n-k==0)
            {
                x=1;
            }
            else
            {
                x=C.Combination(n,k);
            }
            y=(int)Math.pow(b,k);
            z=x*y;
            w=n-k;
            if (n-k==0)
            {
                System.out.print(+z);
            }
            else
            {
                if (k==0)
                {
                    System.out.print("("+a+"^"+w+")"+" + ");
                }
                else
                {
                    System.out.print(+z+"("+a+"^"+w+")"+" + ");
                }
            }
        }
    }
}

        