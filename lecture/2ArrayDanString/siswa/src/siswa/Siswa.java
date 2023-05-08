package siswa;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Siswa {
    public static void main(String[] args) {   
        File fileinput = new File("data.txt");//file yang dibaca
        try
        {   
            Scanner scanfile = new Scanner(fileinput);
            while (scanfile.hasNextLine()) //Check token berikutnya
            {
                String nama = scanfile.nextLine();
                int nilai = Integer.valueOf(scanfile.nextLine()); 
                System.out.println(nama+" "+nilai);}
        }
        catch (FileNotFoundException error) {
           System.out.println("File not found");
        }
        
        
    }
    
}
