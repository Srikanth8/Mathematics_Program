import java.util.*;
public class Input
{
    public double Input(ArrayList<Store> storeArray)
    {
        Storage S=new Storage();
        Scanner scan=new Scanner(System.in);
        String A=scan.next(); 
        try
        {
            return Double.parseDouble(A);
        }
        catch (NumberFormatException e)
        {
            return S.Find(storeArray, A);
        }
    }
}
