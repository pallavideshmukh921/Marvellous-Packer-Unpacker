// Importing input output classes
import java.io.*;

public class GFG2 
{
 
    public static void main(String[] args)
    {
      try
      {  
        FileWriter fw = new FileWriter(
            "C:\\Users\\91937\\Desktop\\Marvellous-Packer-Unpacker\\Data\\FinalCombine\\Marvellous.txt");
             
        fw.write("Educating for better tomorrow");
        fw.close();
    }
    catch(Exception e)
    {
        System.out.println(e);

    }
         System.out.println("success");
    }
}