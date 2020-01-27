/*
Write to file
 */
package writetofile;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Lesley.Maifo
 */
public class WriteToFile {

 
    public static void main(String[] args) {
     
        try
        {
          FileWriter writer = new FileWriter("JavaFile.txt");
          
          writer.write("This is a java file");
          writer.close();
          
        }
        catch(Exception err)
        {
            System.err.println("File Coudnt be created");
        }
        System.out.println("File created");
        
        
        
    }
    
}
