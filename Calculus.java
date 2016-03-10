import java.util.*;
public class Calculus
{
    public double Definite(ArrayList<Store> storeArray, int n)
    {
        Scanner scan=new Scanner(System.in);
        Input I=new Input();
        double[] P=new double[n+1];     
        for (int j=n; j>0; j--)
        {
            System.out.println("Enter the coefficient of x^"+j);
            P[j]=I.Input(storeArray); 
            //P[j]=scan.nextDouble();
        }
        System.out.println("Enter the constant term");
        P[0]=I.Input(storeArray); 
        //P[0]=scan.nextDouble();
        System.out.println("Input the higher limit");
        double a=I.Input(storeArray); 
        //double a=scan.nextDouble();
        System.out.println("Input the lower limit"); 
        double b=I.Input(storeArray); 
        //double b=scan.nextDouble();   

        double total=0;       
        for (int i=0; i<=n; i++)
        {
            total=total+((P[i]/(i+1))*Math.pow(a,i+1))-((P[i]/(i+1))*Math.pow(b,i+1));     
        }        
        System.out.println("Definite Integral of Polynomial from "+a+" to "+b+" = "+total);
        return total;
    }
    
    public double Diff(int n)
    {
        Scanner scan=new Scanner(System.in);
        double[] P=new double[n+1];     
        for (int j=n; j>0; j--)
        {
            System.out.println("Enter the coefficient of x^"+j);
            P[j]=scan.nextDouble();
        }
        System.out.println("Enter the constant term");
        P[0]=scan.nextDouble();
        System.out.println("Input value of x for which dy/dx is to be calculated");
        double x=scan.nextDouble();
        
        double total=0;       
        for (int i=0; i<=n; i++)
        {
            total=total+(P[i]*i*Math.pow(x,i-1));  
        }        
        System.out.println("dy/dx at x="+x+" = "+total);
        return total;
    }
}