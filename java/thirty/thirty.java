//@naman_d0shi
import java.io.*;
public class thirty
{
    public static void main(String[] args)
    {
        try
        {
            // Creating new Text file
              File file = new File("FileExample.txt");
              if (!file.exists())
                {
                file.createNewFile();
                System.out.println("File created Successfully.");
                }
                FileOutputStream fout=new FileOutputStream("FileExample.txt");
                // Writing to new Text file
                String s="India is great.";
                byte b[]=s.getBytes();
                fout.write(b);
                fout.close();
                System.out.println("Writing Complete!");
                FileInputStream fin = new FileInputStream("FileExample.txt");
                
                //Reading from Text file
                int i;
                while((i=fin.read())!=-1)
                {
                    System.out.print((char)i);
                }
                fin.close();
                fout=new FileOutputStream("FileExample.txt");
                // Modifying Text file
                s="I love India.";
                b=s.getBytes();
                fout.write(b);
                fout.close();
                System.out.println("\n Modification Complete!");
                fin = new FileInputStream("FileExample.txt");
                //Reading from Text file
                while((i=fin.read())!=-1)
                {
                System.out.print((char)i);
                }
                fin.close();
                }
                    
                catch (IOException e)
                {
                    System.out.println("I/O Exception occurred.");
                }
        }
}
