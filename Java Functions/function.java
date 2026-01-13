import java.util.*;
public class function{

    public static void firstlesson(int sum1,int sum2){
        System.out.println("Hello World");
        int sum = sum1 + sum2;
        System.out.println("The Sum is: " + sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        firstlesson(a,b);
    }
}