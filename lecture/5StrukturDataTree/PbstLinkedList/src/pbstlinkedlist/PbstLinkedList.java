package pbstlinkedlist;
import java.util.Random;
import java.util.Scanner;

public class PbstLinkedList {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("banyak data = ");
        char x;
        int n = input.nextInt();
        Bst T=new Bst();
        Random r=new Random();
        for(int i=1;i<=n;i++){
            x=(char)(r.nextInt(26)+65);
            System.out.print(x+" ");
            //T.root = T.insertR(x,T.root);
           T.insert(x); 
         }
        System.out.println();
        System.out.print("PreOrder  :");
        T.preOrder(T.root);
        System.out.println();
        System.out.print("InOrder   :");
        T.inOrder(T.root);
        System.out.println();
        System.out.print("PostOrder :");
        T.postOrder(T.root);
        System.out.println();
        System.out.print("Data yg dicari :");
        char huruf=input.next().charAt(0);
        System.out.println();
        System.out.println(" ada = "+T.find(huruf));
        System.out.println(" Minimum = "+T.findMin());
        System.out.println(" Maksimum = "+T.findMax());
        T.delLeaf(huruf);
        T.removemax(T.root);
        T.removeRoot();
        System.out.println();
        System.out.print("PreOrder  :");
        T.preOrder(T.root);
        System.out.println();
        System.out.print("InOrder   :");
        T.inOrder(T.root);
        System.out.println();
  
    }
    
}
