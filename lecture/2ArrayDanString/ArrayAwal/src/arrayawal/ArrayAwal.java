package arrayawal;
import java.util.Scanner;
import java.util.Random;

public class ArrayAwal {
    
  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan banyak data :");
        int n=input.nextByte();
        OrdArray X=new OrdArray(n);
        Random r=new Random();
        for(int i=0;i<n;i++){       
            X.insert(r.nextInt(100)+1);
        }
        X.display();
        System.out.print("Data yang akan dicari :");
        int key=input.nextInt();
        System.out.println("Data ada di indeks "+X.find(key));
        System.out.print("Data yang akan dihapus :");
        key=input.nextInt();
        if (X.delete(key))
          X.display();
        else
          System.out.println("Data tidak ada ");
    }
    
}
