import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int stackSize;
    int stackNum;
    Scanner in = new Scanner(System.in);

    System.out.print("How many integers? ");
    stackSize= in.nextInt();

    Stack stack = new Stack(stackSize);

    for (int i = 0; i < stackSize; i++) {
      stack.push((int)(Math.random()*100+1));
    }

    while(!stack.isEmpty()) {
      double value = stack.pop();
      System.out.print(value + " ");
    }
    System.out.println();
  }
}
