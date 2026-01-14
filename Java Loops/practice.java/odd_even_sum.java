import java.util.*;
public class odd_even_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evensum=0;int oddsum=0;
        System.out.println("Enter the range of number you want to enter: ");
        int qty= sc.nextInt();

        for(int i=1;i<=qty;i++){
        System.out.print("Enter the number" );
        int num = sc.nextInt();
        
        if (num%2==0)
        {evensum = evensum + num;}
            else {oddsum = oddsum + num;}
                
        }
        System.out.println("Sum of Even number: " + evensum);
        System.out.println("Sum of odd number: " + oddsum);
        
    }

}
    
