class Factorial
{
    public static int Fac(int x)
    {
        int t=x;
        if (x>0)
        {
            while (x>1)
            {
                t=t*(x-1);
                x=x-1;
            }
            return t;
        }
        else
        {
            return 1;
        }
    }
}
