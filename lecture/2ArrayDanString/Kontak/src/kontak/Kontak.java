package kontak;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Kontak {
    public static void binarySearch(Contact[] x,int aw,int ak,String nm)
    {int mid,j;
     if(aw<=ak) {
        mid =(aw+ak)/2;
        if(x[mid].nama.compareTo(nm)==0) {
            System.out.println("No. HP = ");
            for(j=0;j<x[mid].hp.length;j++)
              System.out.print(x[mid].hp[j]+" ");
        }
        else if(x[mid].nama.compareTo(nm)>0)
                binarySearch(x,aw,mid-1,nm);
            else
               binarySearch(x,mid+1,ak,nm);
        }
     else System.out.print("Kontak tidak ada");
   }

    public static void main(String[] args) {
        File fileinput = new File("kontaks.txt");//file yang dibaca
        Contact[] x=new Contact[100];
        String nohp;
        int i=0,n=0,j;
        try
        {   Scanner scanfile = new Scanner(fileinput);
            while (scanfile.hasNextLine()) //Check token berikutnya
            { Contact data=new Contact();
              data.nama = scanfile.nextLine();
              nohp = scanfile.nextLine();
              data.hp = nohp.split(" ");
              x[i]=data;
              i++;
            }
            n=i;
         }
        catch (FileNotFoundException error) {
            System.out.println("File not found");
     }     
     for(i=0;i<n;i++) {
        System.out.print(x[i].nama+" ");
        for(j=0;j<x[i].hp.length;j++)
             System.out.print(x[i].hp[j]+" ");
        System.out.println();
     }
     System.out.println("Total jumlah kontak = " + n);
     for(i=0;i<n-1;i++) 
       for(j=i+1;j<n;j++) 
         if(x[i].nama.compareTo(x[j].nama)>0){
             Contact t=x[i];x[i]=x[j];x[j]=t;
         }
     System.out.println();
     for(i=0;i<n;i++) {
        System.out.print(x[i].nama+" ");
        for(j=0;j<x[i].hp.length;j++)
             System.out.print(x[i].hp[j]+" ");
        System.out.println();
     }
     
     
     Scanner input=new Scanner(System.in);
     System.out.print("nama kontak = ");
     String nm = input.nextLine();
     binarySearch(x,0,n-1,nm);
    }
}
