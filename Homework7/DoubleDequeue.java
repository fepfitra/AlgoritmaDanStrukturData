import java.util.Scanner;
public class DoubleDequeue {
  public static void main(String[] args) {
    int queueSize;
    int numTemp;
    int numChoice = 0;

    Scanner in = new Scanner(System.in);
    System.out.print("Enter queue size: ");
    queueSize = in.nextInt();

    QueueInit theQueue = new QueueInit(queueSize);

    while (numChoice != 4) {
      System.out.println("\n 1: Enqueue\n 2: Dequeue Front\n 3: Dequeue Rear\n 4: Exit");
      System.out.print("Enter command :");
      numChoice = in.nextInt();
      if(numChoice == 1) {
        if (theQueue.isFull()) {
          System.out.println("Queue is full");
        } else {
          System.out.print("Enter number: ");
          numTemp = in.nextInt();
          theQueue.enqueue(numTemp);
        }
      } else if (numChoice == 2) {
        if (theQueue.isEmpty()) {
          System.out.println("Queue is empty");
        } else {
          numTemp = theQueue.dequeueFront();
          System.out.println("Dequeue number: " + numTemp);
        }
      } else if (numChoice == 3){
        if (theQueue.isEmpty()) {
          System.out.println("Queue is empty");
        } else {
          numTemp = theQueue.dequeueRear();
          System.out.println("Dequeue number: " + numTemp);
        }
      } else if (numChoice != 4){
        System.out.println("Wrong command");
      }
    }
  }
}
