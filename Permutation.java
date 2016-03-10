import java.util.Scanner;
public class Permutation
{
    public int Permutation(int n, int k)
    {

        Factorial F=new Factorial();
        int p=F.Fac(n)/F.Fac(n-k);
        return p;

    }
}

