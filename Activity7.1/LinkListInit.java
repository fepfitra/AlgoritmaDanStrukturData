public class LinkListInit {
  Node first;

  LinkListInit() {
    first = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void insertFirst(int data) {
    Node newNode = new Node(data);
    newNode.next = first;
    first = newNode;
  }

  public void insertLast(int data) {
    if (first == null) {
      insertFirst(data);
    } else {
      Node temp = first;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(data);
    }
  }

  public void deleteFirst() {
    Node temp = first;
    first = first.next;
    temp.next = null;
  }

  public void deleteLast() {
    Node temp = first;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
  }

  public void displayList() {
    System.out.println("List (first-->last):");
    Node current = first;
    while (current != null) {
      current.displayLink();
      current = current.next;
    }
    System.out.println();
  }
}
