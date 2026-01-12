import java.util.*;
public class elif {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int input = sc.nextInt();
        if (input>=18)
        System.out.println("You are Adult");
        else if (input>=13 && input<18)
        System.out.println("You are a Teenager");
        else
        System.out.println("You are a Child");
        sc.close();
    }
}
        
        