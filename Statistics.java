import java.lang.Math;
import java.util.*;
public class Statistics
{
    public void Stat(ArrayList<Store> storeArray)
    {
        Scanner scan=new Scanner(System.in);
        Input I=new Input();
        System.out.println("How many data values would you like to input?");
        int n=scan.nextInt();
        double x;
        int f;
        double[] A=new double[n];
        int[] B=new int[n];

        for (int i=0; i<n; i++)
        {            
            System.out.println("Input data value");
            x=I.Input(storeArray); 
            A[i]=x;

            System.out.println("Input frequency of data value"); 
            f=scan.nextInt();
            B[i]=f;
        }
        
        double intermediate;
        int g;
        for (int p=0; p<n; p++)   // This code fragment is used to sort the data in ascending order. Sorting is required to calculate median.
        {
            for (int t=p+1; t<n; t++)
            {
                if (A[t]>A[p])
                {
                    intermediate = A[t];
                    A[t]=A[p];
                    A[p]=intermediate;
                    
                    g = B[t];
                    B[t]=B[p];
                    B[p]= g;
                }
            }
        }
        
        double total=0;
        double size=0;
        double totalSquare=0;
        for (int j=0; j<n; j++)
        {
            total=total+(A[j]*B[j]);
            size=size+B[j];
            totalSquare=totalSquare+(A[j]*A[j]*B[j]);
        }
        double mean=total/size;
        double meanSquare=totalSquare/size;
        double variance=meanSquare-(mean*mean);
        double sd=Math.sqrt(variance);

        int a;
        int sum=0;
        int k=0;
        double median=0;
        if (n%2==0)
        {
            a=(n/2);
            for (k=0; sum<a; k++)
            {
                sum=sum+B[k];
            }
            if (sum==a)
            {
                median=(A[k]+A[k+1])/2;
            }
            else
            {
                median=A[k];
            }
        }
        else
        {
            a=(n+1)/2;
            for (k=0; sum<a; k++)
            {
                sum=sum+B[k];
            }
            median=A[k];
        }

        int max=0;
        int maxIndex=0;
        for (int l=0; l<n; l++)
        {
            if (B[l]>max)
            {
                max=B[l];
                maxIndex=l;
            }
        }
        double mode=A[maxIndex];
        System.out.println("");

        System.out.println("Mean = "+mean);
        System.out.println("Summation(x) = "+total);
        System.out.println("Summation(x^2) = "+totalSquare);
        System.out.println("No. of data values = "+size);
        System.out.println("Variance = "+variance);
        System.out.println("Standard Deviation = "+sd);
        System.out.println("Median = "+median);
        System.out.println("Mode = "+mode);
    }

    public double Binom()
    {
        Scanner scan=new Scanner(System.in); 
        System.out.println("Input no. of trials");
        int n=scan.nextInt();
        System.out.println("Input probability of success");
        double p=scan.nextDouble();
        System.out.println("Input no. of successes");
        int x=scan.nextInt();

        Combination C=new Combination();
        double prob; double a=0;
        for (int i=0; i<=n; i++)
        {
            prob=C.Combination(n,i)*Math.pow(p,i)*Math.pow(1-p,n-i);  
            if (i==x)
            {
                System.out.println("Probability of "+i+" successes = "+prob+"  <-- Solution");
                a=prob;
            }
            else
            {
                System.out.println("Probability of "+i+" successes = "+prob);
            }
        }
        return a;
    }

    public double Hyper()
    {
        Scanner scan=new Scanner(System.in); 
        System.out.println("Input population size");
        int N=scan.nextInt();
        System.out.println("Input no. of required elements in the population");
        int D=scan.nextInt();
        System.out.println("Input size of sample");
        int n=scan.nextInt();
        System.out.println("Input no. of elements required in the sample");
        int x=scan.nextInt();

        Combination C=new Combination();
        double prob; double a=0;
        for (int i=0; i<=n; i++)
        {
            prob=(C.Combination(D,i)*C.Combination(N-D,n-i))/C.Combination(N,n); 
            if (i==x)
            {
                System.out.println("Probability of selecting "+i+" required elements = "+prob+"  <-- Solution");
                a=prob;
            }
            else
            {
                System.out.println("Probability of selecting "+i+" required elements = "+prob);
            }
        }
        return a;
    }

    public double Poisson()
    {
        Scanner scan=new Scanner(System.in); 
        System.out.println("Input the parameter value in the distribution (rate x interval)");
        double u=scan.nextDouble();
        System.out.println("Input no. of events expected in the particular interval");
        int x=scan.nextInt();

        int i=x-6;
        if (x<6)
        {
            i=0; 
        }

        Factorial F=new Factorial();
        double prob; double a=0;
        for (; i<=x+6; i++)
        {
            prob=(Math.pow(Math.E,-u)*Math.pow(u,i))/F.Fac(i);
            if (i==x)
            {
                System.out.println("Probability of "+i+" events occuring in the interval = "+prob+"  <-- Solution");
                a=prob;
            }
            else
            {
                System.out.println("Probability of "+i+" events occuring in the interval = "+prob);
            }
        }
        return a;
    }
}

   