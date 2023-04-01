import java.util.*;

class Node {
  String data;
  Node left;
  Node right;

  Node(String data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class Calculator {
  public static void main(String[] args) {
    String infixExpression = "5 + ( 6 - 2 ) * 4 / 2";
    String prefixExpression = convertToPrefix(infixExpression);
    // System.out.println("Prefix notation: " + prefixExpression);

    Node root = buildExpressionTree(prefixExpression);
    double result = evaluate(root);
    System.out.println((int)result);
  }

  public static String convertToPrefix(String infixExpression) {
      Stack<Character> operatorStack = new Stack<>();
      Stack<String> operandStack = new Stack<>();

      for (int i = 0; i < infixExpression.length(); i++) {
          char c = infixExpression.charAt(i);

          if (c == ' ') {
              continue;
          } else if (Character.isDigit(c)) {
              String operand = "";
              while (i < infixExpression.length() && (Character.isDigit(infixExpression.charAt(i)) || infixExpression.charAt(i) == '.')) {
                  operand += infixExpression.charAt(i++);
              }
              operandStack.push(operand);
              i--;
          } else if (c == '(') {
              operatorStack.push(c);
          } else if (c == ')') {
              while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                  String rightOperand = operandStack.pop();
                  String leftOperand = operandStack.pop();
                  char operator = operatorStack.pop();
                  String result = operator + " " + leftOperand + " " + rightOperand;
                  operandStack.push(result);
              }
              operatorStack.pop(); // pop the '('
          } else { // c is an operator
              while (!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(c)) {
                  String rightOperand = operandStack.pop();
                  String leftOperand = operandStack.pop();
                  char operator = operatorStack.pop();
                  String result = operator + " " + leftOperand + " " + rightOperand;
                  operandStack.push(result);
              }
              operatorStack.push(c);
          }
      }

      while (!operatorStack.isEmpty()) {
          String rightOperand = operandStack.pop();
          String leftOperand = operandStack.pop();
          char operator = operatorStack.pop();
          String result = operator + " " + leftOperand + " " + rightOperand;
          operandStack.push(result);
      }

      return operandStack.pop();
  }

private static int getPrecedence(char operator) {
    switch (operator) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        default:
            return 0;
    }
}
  public static Node buildExpressionTree(String prefixExpression) {
      Stack<Node> stack = new Stack<>();
      List<String> tokens = Arrays.asList(prefixExpression.split(" "));
      
      Collections.reverse(tokens);
      
      for (String token : tokens) {
          if (isOperator(token)) {
              Node node = new Node(token);
              node.left = stack.pop();
              node.right = stack.pop();
              stack.push(node);
          } else {
              stack.push(new Node(token));
          }
      }
      
      return stack.pop();
  }

  private static boolean isOperator(String token) {
      return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
  }

  public static double evaluate(Node root) {
    if (root == null) {
        return 0;
    }
    if (root.left == null && root.right == null) {
        return Double.parseDouble(root.data);
    }

    double leftValue = evaluate(root.left);
    double rightValue = evaluate(root.right);

    if (root.data.equals("+")) {
        return leftValue + rightValue;
    } else if (root.data.equals("-")) {
        return leftValue - rightValue;
    } else if (root.data.equals("*")) {
        return leftValue * rightValue;
    } else if (root.data.equals("/")) {
        if (rightValue == 0) {
            throw new ArithmeticException("Division by zero error");
        }
        return leftValue / rightValue;
    } else {
        throw new IllegalArgumentException("Invalid operator: " + root.data);
    }
  }
}
