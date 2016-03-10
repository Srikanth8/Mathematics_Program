import java.util.Scanner;
public class Combination
{
    public int Combination(int n, int k)
    {
        Factorial F=new Factorial(); 
        int c=F.Fac(n)/F.Fac(n-k);
        c=c/F.Fac(k);
        return c;
    }
}
