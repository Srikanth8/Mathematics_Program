import java.lang.Math;
import java.util.Scanner;
public class Quadratics
{
    public double[] Quadratic()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(""); 
        System.out.println("a(x^2)+b(x)+c");
        System.out.println(""); 
        System.out.println("Enter the value of a");
        double a=scan.nextDouble();
        System.out.println("Enter the value of b");
        double b=scan.nextDouble();
        System.out.println("Enter the value of c");
        double c=scan.nextDouble();
        System.out.println(""); 

        int flag=0;
        double xa=0;
        double xb=0;
        if ((b*b)-(4*a*c)>=0)
        {
            xa=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
            xb=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
            flag=1;
        }
        else
        if ((b*b)-(4*a*c)<0)
        {
            flag=2;            
        }
        double xm=-b/(2*a);
        double ym=(a*xm*xm)+(b*xm)+c;
        double[] A={xa,xb,xm,ym};
        if (flag==1)
        {
            System.out.println("x-intercepts = "+xa+"and "+xb);               
        }
        else
        {
            if (flag==2)
            {
                System.out.println("The equation has no real roots");
            }
            else
            {
                System.out.println("x-intercept = "+xa);   
            }
        }
        System.out.println("Stationary point (x-coordinate)"+xm);
        System.out.println("Stationary point (y-coordinate)"+ym);
        return A;
    }
}


   