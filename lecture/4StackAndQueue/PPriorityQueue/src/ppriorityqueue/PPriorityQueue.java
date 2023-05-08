package ppriorityqueue;
import java.util.PriorityQueue;

public class PPriorityQueue {
   public static void main(String[] args) {
       PriorityQueue<String> PQ = new PriorityQueue<>();
        PQ.add("abcd");
        PQ.add("1234");
        PQ.add("23ab");
        PQ.add("zzxx");
        PQ.add("abxy");
        System.out.println(PQ.peek());
        System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
        while (!PQ.isEmpty()) {
            System.out.println(PQ.remove());
        } 
        System.out.println(PQ);
    }
    
}
