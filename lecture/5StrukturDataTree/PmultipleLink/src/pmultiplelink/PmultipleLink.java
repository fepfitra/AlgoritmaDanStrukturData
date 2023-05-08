package pmultiplelink;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class PmultipleLink {
    public static void main(String[] args) {
        File fileinput; 
        Mlist L=new Mlist();
        try
        {   fileinput = new File("sport.txt");//file yang dibaca
            Scanner scanfile = new Scanner(fileinput);
            while (scanfile.hasNextLine()) //Check token berikutnya
            {  String cabang=scanfile.nextLine();
               NodeP input=new NodeP();
               input.nama=scanfile.nextLine();input.next=null;
  //             System.out.println(cabang+": "+input.nama);
               L.insertPeserta(cabang, input);
            }
        }
        catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }  
        L.display();
        System.out.println("Mencari peserta :");
        L.findPemain("harsoyo");
    }
    
}
