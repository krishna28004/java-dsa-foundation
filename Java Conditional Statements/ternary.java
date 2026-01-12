import java.util.*;
public class ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int input = sc.nextInt();
        String Number = (input%2==0)?"even":"odd";
        System.out.println("The number is " + Number);
    }
    
}
