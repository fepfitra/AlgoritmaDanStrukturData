public class TestSharedArrayStack {
  public static void main(String[] args) {
    SharedArrayStack stack = new SharedArrayStack(5);
    stack.pushA(1);
    stack.pushA(2);
    stack.pushB(3);
    stack.pushB(4);

    System.out.println(stack.popA());
    System.out.println(stack.popB());
    System.out.println(stack.popA());
    System.out.println(stack.popB());
    System.out.println(stack.popA());
    System.out.println(stack.popB());
  }
}
