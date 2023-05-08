package pheap;
import java.util.Random;
import java.util.Scanner;

public class PHeap {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("banyak data = ");
        int x[],j;boolean ada;
        int n = input.nextInt();x=new int[n];
        Heap T=new Heap(n);
        Heap H=new Heap(n);
        Random r=new Random();
        for(int i=0;i<n;i++){
         do {  
            x[i]=r.nextInt(100)+1;
            j=i-1;ada=false;
            while (j>=0){ 
               if (x[i]==x[j]) {
                     ada=true;j=-1;
               } else j--;
            }
           } while (ada);
            System.out.print(x[i]+" ");
     //       T.insert(x[i], i);
         }
        System.out.println();
     //  T.cetak();
      // T.removeMax();
      // T.cetak();
      //   for(int i=n;i>0;i--){
       //   T.removeMaxS(i);
      //    T.cetak();
       //  }
         H.insert(x);
         H.cetak();
     //  H=T;
       for(int i=(n-2)/2;i>=0;i--){
           H.minheap(i);
       }
       H.cetak();
   }
    
}
