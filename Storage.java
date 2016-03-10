import java.io.*;
import java.util.*;
import java.lang.Math;
public class Storage
{
    public void Record(ArrayList<Store> storeArray, String name, String a, double b)
    {        
        boolean found=false;
        for (int z=0; z<storeArray.size(); z++)
        {
            if (storeArray.get(z).variable.equals(a))
            {
                storeArray.remove(z);  
                storeArray.add(z, new Store(a,b)); 
                found=true;
            }
        }     
        if (!found)
        {
            storeArray.add(new Store(a,b));  
        }

        String fileName = name+"Variables.txt";
        try 
        {
            FileWriter fileWriter =new FileWriter(fileName);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            String x;
            for (int k=0; k<storeArray.size(); k++)
            {
                bufferedWriter.write(storeArray.get(k).variable);
                bufferedWriter.newLine();
                x=String.valueOf(storeArray.get(k).value);
                bufferedWriter.write(x);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch(IOException ex) 
        {}
    }

    public void Retain(ArrayList<Store> storeArray, String name)
    {        
        try
        {
            String fileName=name+"Variables.txt";
            FileReader fileReader=new FileReader(fileName);        
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String a;
            double b;
            for (int x=0; (a=bufferedReader.readLine()) != null; x++)
            {
                b=Double.parseDouble(bufferedReader.readLine());
                storeArray.add(new Store(a,b));                
            }
            bufferedReader.close();			
        }
        catch(FileNotFoundException e)
        {}        
        catch(IOException e)
        {}
    }

    public double Find(ArrayList<Store> storeArray, String var)
    {
        boolean found=false;
        for (int z=0; z<storeArray.size(); z++)
        {
            if (storeArray.get(z).variable.equals(var))
            {
                return storeArray.get(z).value;  
            }
        }       
        if (!found)
        {
            double x=Math.pow(Math.E, Math.PI); // This number is reserved to indicate that the variable does not exist in storeArray               
            return x;
        }
        return 0;
    }

    public void Print(ArrayList<Store> storeArray, int index)
    {
        try
        {
            System.out.println(storeArray.get(index).variable+" "+storeArray.get(index).value);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {}
    }
}

