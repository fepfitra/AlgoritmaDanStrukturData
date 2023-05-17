public class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }

  public void displayLink() {
    System.out.print("{" + this.data + "}");
  }
}
