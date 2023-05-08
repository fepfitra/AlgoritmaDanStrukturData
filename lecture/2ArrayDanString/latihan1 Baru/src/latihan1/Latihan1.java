package latihan1;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Latihan1 {    
    public static void main(String[] args) {
        int n,i=0;
        File fileinput = new File("data.txt");//file yang dibaca
        FileWriter fileoutput;
        try
        {   
            Mhs[] x = new Mhs[10];
            Scanner scanfile = new Scanner(fileinput);
            while (scanfile.hasNextLine()) //Check token berikutnya
            {   
                x[i]=new Mhs();
                x[i].nama = scanfile.nextLine();
                x[i].nilai = Integer.valueOf(scanfile.nextLine());
                i++;
            }
            n=i;
            for(i=0;i<n;i++){
            System.out.println(x[i].nama+" "+x[i].nilai);}
            Sort hasil=new Sort();
            hasil.sort(x,n);
            System.out.println("Data setelah diurutkan :");
            for(i=0;i<n;i++){
            System.out.println(x[i].nama+" "+x[i].nilai);}
            
            fileoutput = new FileWriter("info.txt");
            for(i=0;i<n;i++){
               fileoutput.write(x[i].nama+" "+x[i].nilai);
               fileoutput.write("\n");
            }
            fileoutput.close();
         
        }
        catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
           
    }
}
