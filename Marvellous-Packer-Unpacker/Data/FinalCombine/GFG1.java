// Importing input output classes
import java.io.*;

public class GFG1 
{
 
    public static void main(String[] args)
    {
      try
      {  
        FileWriter fw = new FileWriter(
            "C:\\Users\\91937\\Desktop\\Marvellous-Packer-Unpacker\\Data\\FinalCombine\\Hello.txt");
             
        fw.write("India is my country");
        fw.close();
    }
    catch(Exception e)
    {
        System.out.println(e);

    }
         System.out.println("success");
    }
}