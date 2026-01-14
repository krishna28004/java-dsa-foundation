import java.util.*;
public class reverse_digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int num=sc.nextInt();
        for (int ld;ld>=0;ld++){
            ld=num%10;
            ld=ld+0;
            System.out.println(ld);
        }
    }
    
}
