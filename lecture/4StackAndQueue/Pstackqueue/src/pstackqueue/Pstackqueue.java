package pstackqueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList; 

public class Pstackqueue {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Tuliskan string : ");
        String st = input.nextLine();
        Stack<String> S = new Stack();
      //  Bus B=new Bus();
        Queue<Bus> Q = new LinkedList<Bus>();
        char[] kal;
        kal=st.toCharArray();
        int i=0;
        while(i<st.length()){ 
           String kata="";
           while ((i<st.length()) && (kal[i]!=' ')) {
             kata+=kal[i];i++;
           }
           i++;
           S.push(kata);
           Bus B=new Bus();B.nama=kata.charAt(0);B.jp=i;Q.add(B);
        }
        String hasil=new String(kal);
        System.out.print("Hasilnya :");
         while (!S.isEmpty()){
            System.out.print(S.pop()+" ");
        }
        System.out.println();
        do{
          Bus b=Q.remove();
          System.out.println(b);}
        while(!Q.isEmpty());
    }
    
}
