import java.util.*;
class Main {
  public static void main(String[] args) {
    double num1, num2;
    double result;
    char operator;
    Scanner sc = new Scanner(System.in);
    System.out.println("Which operation do you want to perform?{+,-,*,/}: ");
    operator = sc.next().charAt(0);
    System.out.println("Enter the numbers: ");
    num1 = sc.nextDouble();
    num2 = sc.nextDouble();
    switch (operator) {
      case '+':
        result = num1 + num2;
        System.out.println("The result is: "+result);
        break;
      case '-':
        result = num1 - num2;
        System.out.println("The result is: "+result);
        break;
      case '*':
        result = num1 * num2;
        System.out.println("The result is: "+result);
        break;
      case '/':
        result = num1 / num2;
        System.out.println("The result is: "+result);
        break;
      default:
        System.out.println("Invalid");
        break;
    }
  }
}
