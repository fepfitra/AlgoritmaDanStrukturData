public class SharedArrayStack {
  private int[] arr;
  private int topA;
  private int topB;

  public SharedArrayStack(int size) {
    arr = new int[size];
    topA = -1;
    topB = size;
  }

  public void pushA(int data) {
    if (topA + 1 < topB) {
      topA++;
      arr[topA] = data;
    } else {
      System.out.println("Stack A overflow");
    }
  }

  public void pushB(int data) {
    if (topB - 1 > topA) {
      topB--;
      arr[topB] = data;
    } else {
      System.out.println("Stack B overflow");
    }
  }

  public int popA() {
    if (topA >= 0) {
      int data = arr[topA];
      topA--;
      return data;
    } else {
      System.out.println("Stack A underflow");
      return -1;
    }
  }

  public int popB() {
    if (topB < arr.length) {
      int data = arr[topB];
      topB++;
      return data;
    } else {
      System.out.println("Stack B underflow");
      return -1;
    }
  }
}
