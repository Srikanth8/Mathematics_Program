import java.io.*;
import java.util.*;
public class LogIn
{
    public void Record(ArrayList<User> userArray, String a, int b)
    {        
        userArray.add(new User(a,b));            
        String fileName = "TextDocuments/Record.txt";

        try 
        {
            FileWriter fileWriter =new FileWriter(fileName);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            String x;
            for (int k=0; k<userArray.size(); k++)
            {
                bufferedWriter.write(userArray.get(k).name);
                bufferedWriter.newLine();
                x=String.valueOf(userArray.get(k).pin);
                bufferedWriter.write(x);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch(IOException ex) 
        {}
    }

    public void Retain(ArrayList<User> userArray)
    {        
        try
        {
            String fileName="TextDocuments/Record.txt";
            FileReader fileReader=new FileReader(fileName);        
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            Storage S=new Storage();
            String a;
            int b;
            for (int x=0; (a=bufferedReader.readLine()) != null; x++)
            {
                b=Integer.parseInt(bufferedReader.readLine());
                userArray.add(new User(a,b));  
                ArrayList<Store> storeArray = new ArrayList<Store>();  
                S.Retain(storeArray, a);                
            }
            bufferedReader.close();			
        }
        catch(FileNotFoundException e)
        {}        
        catch(IOException e)
        {}
    }

    public int Check(ArrayList<User> userArray, String a, int b)
    {
        boolean flag=false;
        for (int z=0; z<userArray.size(); z++)
        {
            if (userArray.get(z).name.equals(a))
            {
                if (userArray.get(z).pin == b)
                {
                    flag=true;
                    break;
                }
            }
        }
        if (flag)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public void Print(ArrayList<User> userArray, int index)
    {
        try
        {
            System.out.println(userArray.get(index).name+" "+userArray.get(index).pin);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {}
    }
}
