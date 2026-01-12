import java.util.*;
public class odd_or_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int input = sc.nextInt();
        if (input%2==0)
        System.out.println("The Number is Even");
        else 
        System.out.println("The Number is Odd");
    }
    
}
