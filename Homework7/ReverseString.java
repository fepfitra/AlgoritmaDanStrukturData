import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    String revString;
    int stackNum;
    Scanner in = new Scanner(System.in);
    
    revString = in.next();

    StackInit theStack = new StackInit(revString.length());

    for (int i = 0; i < revString.length(); i++) {
      char c = revString.charAt(i);
      theStack.push((int)c);
    }

    while (!theStack.isEmpty()) {
      char c = (char)theStack.pop();
      System.out.print(c);
    }
  }
}
