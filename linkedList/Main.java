import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();
    Scanner in = new Scanner(System.in);
    int nodeNum1;
    int nodeNum2;
    int tempNum;
    System.out.print("First list size? ");
    nodeNum1 = in.nextInt();

    for (int i = 0; i < nodeNum1; i++) {
      list1.insertLast((int)(Math.random()*100)+1);
    }
    list1.displayList();

    System.out.print("Second list size? ");
    nodeNum2 = in.nextInt();

    for (int i = 0; i < nodeNum2; i++) {
      list2.insertLast((int)(Math.random()*100)+1);
    }
    list2.displayList();

    System.out.println("\nDeleting first node of first list");
    list1.deleteFirst();
    list1.displayList();

    System.out.println("\nDeleting last node of second list");
    list2.deleteLast();
    list2.displayList();
  }
}
