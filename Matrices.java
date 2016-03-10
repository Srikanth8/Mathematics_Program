import java.lang.Math;
import java.util.Scanner;
public class Matrices
{
    public double[][] Input(int row, int clm)
    {
        Scanner scan=new Scanner(System.in);
        double[][] M=new double[row][clm];
        for (int x=0; x<row; x++)
        {
            for (int y=0; y<clm; y++)
            {
                System.out.println("Input value in row "+(x+1)+" column "+(y+1));
                M[x][y]=scan.nextDouble();
            }
        }
        return M;
    }

    public double[][] Multiply()
    {
        Scanner scan=new Scanner(System.in);
        Matrices matrix=new Matrices();
        System.out.println("First matrix:");
        System.out.println("Input no. of rows in the matrix");
        int a=scan.nextInt();
        System.out.println("Input no. of columns in the matrix");
        int b=scan.nextInt();
        double A[][]=matrix.Input(a,b);

        System.out.println("");

        System.out.println("Second matrix:");
        System.out.println("Input no. of rows in the matrix");
        int p=scan.nextInt();
        System.out.println("Input no. of columns in the matrix");
        int q=scan.nextInt();
        double B[][]=matrix.Input(p,q);

        System.out.println("");
        int row=A.length;
        int clm=B[0].length;

        int n=A[0].length;

        double[][] X=new double[row][clm];
        double total;
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<clm; j++)
            {
                total=0;
                for (int k=0; k<n; k++)
                {
                    total=total+(A[i][k]*B[k][j]);
                }
                X[i][j]=total;
                System.out.print(+total+"  ");
            }
            System.out.println("");
        }
        return X;
    }

    public double[][] Addition()
    {
        Scanner scan=new Scanner(System.in);
        Matrices matrix=new Matrices();
        System.out.println("Input no. of rows in both matrices");
        int a=scan.nextInt();
        System.out.println("Input no. of columns in both matrices");
        int b=scan.nextInt();

        System.out.println("First matrix:");
        double A[][]=matrix.Input(a,b);
        System.out.println("");

        System.out.println("Second matrix:");
        double B[][]=matrix.Input(a,b);
        System.out.println("");

        double[][] X=new double[a][b];
        for (int i=0; i<a; i++)
        {
            for (int j=0; j<b; j++)
            {
                X[i][j]=A[i][j]+B[i][j];
                System.out.print(+X[i][j]+"  ");
            }
            System.out.println("");
        }
        return X;
    }

    public double[][] Subtraction()
    {
        Scanner scan=new Scanner(System.in);
        Matrices matrix=new Matrices();
        System.out.println("Input no. of rows in both matrices");
        int a=scan.nextInt();
        System.out.println("Input no. of columns in both matrices");
        int b=scan.nextInt();

        System.out.println("First matrix:");
        double A[][]=matrix.Input(a,b);
        System.out.println("");

        System.out.println("Second matrix:");
        double B[][]=matrix.Input(a,b);
        System.out.println("");

        double[][] X=new double[a][b];
        for (int i=0; i<a; i++)
        {
            for (int j=0; j<b; j++)
            {
                X[i][j]=A[i][j]-B[i][j];
                System.out.print(+X[i][j]+"  ");
            }
            System.out.println("");
        }
        return X;
    }

    public double[][] MultiplyConstant()
    {
        Scanner scan=new Scanner(System.in);
        Matrices matrix=new Matrices();
        System.out.println("Input no. of rows in the matrix");
        int a=scan.nextInt();
        System.out.println("Input no. of columns in the matrix");
        int b=scan.nextInt();

        double A[][]=matrix.Input(a,b);
        System.out.println("");

        System.out.println("Input value of constant");
        double c=scan.nextDouble();
        System.out.println("");

        double[][] X=new double[a][b];
        for (int i=0; i<a; i++)
        {
            for (int j=0; j<b; j++)
            {
                X[i][j]=c*A[i][j];
                System.out.print(+X[i][j]+"  ");
            }
            System.out.println("");
        }
        return X;
    }

    public double Determinant()
    {
        Scanner scan=new Scanner(System.in);
        Matrices matrix=new Matrices();
        System.out.println("Input value of n in your n x n matrix");
        int n=scan.nextInt();
        double A[][]=matrix.Input(n,n);
        System.out.println("");

        double B[][]=B=new double[n-1][n-1];  

        int countA=-1;
        double checkA=1;
        double total=0;  

        if (A.length==2)
        {
            total=total+((A[0][0]*A[1][1])-(A[0][1]*A[1][0])); 
        }
        else
        {
            This_Loop: 
            for (int a=0; a<n; a++)
            {
                for (int d=1; d<n; d++)
                {
                    for (int e=0; e<n; e++)
                    {
                        if (a!=e)
                        {
                            if (d==checkA)
                            {
                                countA=countA+1;
                            }
                            else
                            {
                                countA=0;
                            }
                            B[d-1][countA]=A[d][e];
                            checkA=d;                    
                        }
                    }
                }
                if (B.length==2)
                {
                    total=total+(a*((B[0][0]*B[1][1])-(B[0][1]*B[1][0]))*Math.pow(-1,a)); 
                    System.out.println(+total);
                }
                else
                {
                    int m=n-1;
                    int countB=-1;
                    double checkB=1;
                    total=0;
                    double C[][]=new double[m-1][m-1]; 
                    for (int ab=0; ab<m; ab++)
                    {
                        for (int db=1; db<m; db++)
                        {
                            for (int eb=0; eb<m; eb++)
                            {
                                if (ab!=eb)
                                {
                                    if (db==checkB)
                                    {
                                        countB=countB+1;
                                    }
                                    else
                                    {
                                        countB=0;
                                    }
                                    C[db-1][countB]=B[db][eb];
                                    checkB=db;                    
                                }
                            }
                        }
                        if (C.length==2)
                        {
                            total=total+(ab*((C[0][0]*C[1][1])-(C[0][1]*C[1][0]))*Math.pow(-1,ab));                      
                        }
                        else
                        {
                            int p=m-1;
                            int countC=-1;
                            double checkC=1;
                            total=0;
                            double D[][]=new double[p-1][p-1]; 
                            for (int ac=0; ac<p; ac++)
                            {
                                for (int dc=1; dc<p; dc++)
                                {
                                    for (int ec=0; ec<p; ec++)
                                    {
                                        if (ac!=ec)
                                        {
                                            if (dc==checkC)
                                            {
                                                countC=countC+1;
                                            }
                                            else
                                            {
                                                countC=0;
                                            }
                                            D[dc-1][countC]=C[dc][ec];
                                            checkC=dc;                    
                                        }
                                    }
                                }
                                if (D.length==2)
                                {
                                    total=total+(ac*((D[0][0]*D[1][1])-(D[0][1]*D[1][0]))*Math.pow(-1,ac));
                                }
                                else
                                {
                                    System.out.println("Matrix is too large!");
                                    break This_Loop;
                                }
                            }
                        }
                    }                
                }
            }
        }
        System.out.println("Determinant of Matrix = "+total);
        return total;
    }

    /*public double[][] Inverse()
    {
        Scanner scan=new Scanner(System.in);
        Matrices matrix=new Matrices();

        System.out.println("Input value of n in your n x n matrix");
        int n=scan.nextInt();
        double A[][]=matrix.Input(n,n);
        System.out.println("");

        double B[][]=new double[n][n];  
        double x=matrix.Determinant(A,n);

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                B[i][j]=(1/x)*A[i][j];
                System.out.print(+B[i][j]+"  ");
            }
            System.out.println("");
        }
        return B;
    }*/
}
