public class LinkedList {
  private Node first;

  public LinkedList() {
    first = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void insertFirst(int id) {
    Node newNode = new Node(id);
    newNode.next = first;
    first = newNode;
  }

  public void insertLast(int id) {
    if (first == null) {
      insertFirst(id);
    } else {
      Node temp = first;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(id);
    }
  }

  public Node deleteFirst() {
    Node temp = first;
    first = first.next;
    return temp;
  }

  public Node deleteLast() {
    Node temp = first;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    Node toReturn = temp.next;
    temp.next = null;
    return toReturn;
  }

  public void displayList() {
    System.out.print("List (first --> list): ");
    Node current = first;
    while (current != null) {
      current.displayLink();
      current = current.next;
    }
    System.out.println();
  }
}
