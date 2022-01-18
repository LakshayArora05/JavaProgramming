import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    char operator;
    Double n1;
    Double n2, result;
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose an operator:");
    System.out.println("+: addition");
    System.out.println("-:subtraction");
    System.out.println("*:multiplication");
    System.out.println("/:division");
    operator = scan.next().charAt(0);
    System.out.println("Enter first number");
    n1 = scan.nextDouble();
    System.out.println("Enter second number");
    n2 = scan.nextDouble();
    switch (operator) {
      case '+':
        result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        break;
      case '-':
        result = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + result);
        break;
      case '*':
        result = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + result);
        break;
      case '/':
        result = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    scan.close();
  }
}
