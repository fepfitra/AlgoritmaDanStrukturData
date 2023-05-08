package pstack;
import java.util.Scanner;

public class Pstack {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Masukkan sebuah Kalimat : ");
        String str = input.nextLine();
       // int n=input.nextInt();
        Kalimat kal=new Kalimat();
        //kal.balikS(str);
         //kal.balikBil(n);
         kal.balance(str);
       System.out.println(kal.balikKal(str));
      //System.out.println(kal.palindrom(str));
     System.out.println();
   }
    
}