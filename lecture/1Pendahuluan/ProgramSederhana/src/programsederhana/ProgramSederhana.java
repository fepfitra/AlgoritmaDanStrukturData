package programsederhana;
import java.util.Scanner;
import java.util.Random;
public class ProgramSederhana {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      System.out.print("masukkan banyaknya data = ");
      int n = input.nextInt();
      Random r=new Random();
      for(int i=1;i<=n;i++){
          int x=r.nextInt(100)+1;  
          System.out.print(x+" ");
          if (i%10==0) System.out.println();
        }
      System.out.println();
    }
    
}
