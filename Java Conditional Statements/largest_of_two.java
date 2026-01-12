import java.util.*;
public class largest_of_two {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int input1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int input2 = sc.nextInt();
        if (input1>input2)
        System.out.println("First Number is Greater: " + input1);
        else 
        System.out.println("Second Number is Greater: " + input2);
    }
    
}
