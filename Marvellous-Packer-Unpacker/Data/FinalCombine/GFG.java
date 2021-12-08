// Importing input output classes
import java.io.*;
 
// Main class
public class GFG 
{
 
    // main driver method
    public static void main(String[] args)
    {
      try
      {  
        // File path is passed as parameter
        FileWriter fw = new FileWriter(
            "C:\\Users\\91937\\Desktop\\Marvellous-Packer-Unpacker\\Data\\FinalCombine\\Demo.txt");
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        fw.write("abcdefghhij");
        //BufferedReader br
            //= new BufferedReader(new FileReader(file));
        
        fw.close();
    }
    catch(Exception e)
    {
        System.out.println(e);

    }
        // Declaring a string variable
        //String st;
        // Consition holds true till
        // there is character in a string
        //while ((st = br.readLine()) != null)
 
            // Print the string
         System.out.println("success");
    }
}