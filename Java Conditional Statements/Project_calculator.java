import java.util.*;
public class Project_calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int input1 = sc.nextInt();

        System.out.print("Enter b: ");
        int input2 = sc.nextInt();

        System.out.print("Enter Operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Ans: " + (input1 + input2));
                break;
            case '-':
                System.out.println("Ans: " + (input1 - input2));
                break;
            case '*':
                System.out.println("Ans: " + (input1 * input2));
                break;
            case '/':
                if (input2 != 0) {
                    System.out.println("Ans: " + (input1 / input2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (input2 != 0) {
                    System.out.println("Ans: " + (input1 % input2));
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
        }
    }
}
