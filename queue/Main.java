import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int queueSize;
    int numTemp;
    int numChoice = 0;
    Scanner in = new Scanner(System.in);

    System.out.print("Enter queue size: ");
    queueSize = in.nextInt();
    Queue queue = new Queue(queueSize);

    while (numChoice != 3) {
      System.out.println("\n1. Enqueue 2. Dequeue 3. End");
      System.out.print("Enter command: ");
      numChoice = in.nextInt();
      if (numChoice == 1) {
        if (queue.isFull()) {
          System.out.println("Queue is full");
        } else {
          // System.out.print("Enter number:");
          // numTemp = in.nextInt();
          numTemp = (int)(Math.random()*100+1);
          System.out.println("Enqueued number : " + numTemp);
          queue.enqueue(numTemp);
        }
      } else if (numChoice == 2) {
        if (queue.isEmpty()) {
          System.out.println("Queue is empty");
        } else {
          numTemp = queue.dequeue();
          System.out.println("Dequequed number :" + numTemp);
        }
      } else if (numChoice != 3) {
        System.out.println("Wrong command");
      }
    }
  }
}
