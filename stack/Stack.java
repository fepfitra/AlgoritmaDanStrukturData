public class Stack {
  private final int maxSize;
  private final int[] stackArray;
  private int top;

  public Stack(int size) {
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
  }

  public void push(int data) {
    stackArray[++top] = data;
  }

  public double pop() {
    return stackArray[top--];
  }

  public boolean isEmpty() {
    return top == -1;
  }
}
