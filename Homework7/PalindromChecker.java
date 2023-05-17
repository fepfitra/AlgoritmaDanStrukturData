import java.util.Scanner;
public class PalindromChecker {
  public static void main(String[] args) {
    String palString;
    int stackNum;
    Scanner in = new Scanner(System.in);
    
    // System.out.print("Input string > ");
    palString = in.next();

    int len = palString.length()/2;
    StackInit stackFront = new StackInit(len);
    StackInit stackRear = new StackInit(len);

    for (int i = 0; i < len; i++) {
      char front = palString.charAt(i);
      char rear = palString.charAt(palString.length()-1-i);
      stackFront.push((int)front);
      stackRear.push((int)rear);
    }

    boolean isPalindrome = true;
    while (!stackFront.isEmpty()) {
      int front = (char)stackFront.pop();
      int rear = (char)stackRear.pop();
      if (front != rear) {
        isPalindrome = false;
        break;
      }
    }

    if (isPalindrome) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not palindrome");
    }
  }
}
