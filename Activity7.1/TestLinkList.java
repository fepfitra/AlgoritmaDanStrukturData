import java.util.Scanner;

public class TestLinkList {
  public static void main(String[] args) {
    LinkListInit theList1 = new LinkListInit();
    LinkListInit theList2 = new LinkListInit();

    Scanner in = new Scanner(System.in);
    int nodeNum1;
    int nodeNum2;
    int tempNum;

    System.out.print("First list size? ");
    nodeNum1 = in.nextInt();
    for (int i = 0; i < nodeNum1; i++) {
      System.out.print("Insert number: ");
      tempNum = in.nextInt();
      theList1.insertLast(tempNum);
    }
    theList1.displayList();

    System.out.print("Second list size? ");
    nodeNum2 = in.nextInt();
    for (int i = 0; i < nodeNum2; i++) {
      System.out.print("Insert number: ");
      tempNum = in.nextInt();
      theList2.insertLast(tempNum);
    }
    theList2.displayList();

    System.out.print("\nDeleting the first node on the first list");
    theList1.deleteFirst();
    theList1.displayList();

    System.out.print("\nDeleting the last node on the second list");
    theList2.deleteLast();
    theList2.displayList();
  }
}
