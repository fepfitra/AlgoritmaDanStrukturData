
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        Stack<String> stack = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                stack.push(arr[i]);
            } else if (arr[i].equals(")")) {
                while (!stack.peek().equals("(")) {
                    stack2.push(stack.pop());
                }
                stack.pop();
            } else if (arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/")) {
                if (stack.isEmpty()) {
                    stack.push(arr[i]);
                } else {
                    while (!stack.isEmpty() && !stack.peek().equals("(")) {
                        stack2.push(stack.pop());
                    }
                    stack.push(arr[i]);
                }
            } else {
                stack2.push(arr[i]);
            }
        }
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        Stack<String> stack3 = new Stack<String>();
        while (!stack2.isEmpty()) {
            if (stack2.peek().equals("+") || stack2.peek().equals("-") || stack2.peek().equals("*") || stack2.peek().equals("/")) {
                int a = Integer.parseInt(stack3.pop());
                int b = Integer.parseInt(stack3.pop());
                if (stack2.peek().equals("+")) {
                    stack3.push(String.valueOf(a + b));
                } else if (stack2.peek().equals("-")) {
                    stack3.push(String.valueOf(b - a));
                } else if (stack2.peek().equals("*")) {
                    stack3.push(String.valueOf(a * b));
                } else if (stack2.peek().equals("/")) {
                    stack3.push(String.valueOf(b / a));
                }
                stack2.pop();
            } else {
                stack3.push(stack2.pop());
            }
        }
        System.out.println(stack3.pop());
    }
}
