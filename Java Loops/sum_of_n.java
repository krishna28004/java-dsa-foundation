import java.util.*;
public class sum_of_n {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want sum: ");
        int n=sc.nextInt();
        int i=0;
        int sum = 0;
        while (i<=n){
            sum= sum + i;
            i++;
        }
        System.out.println(sum);
    }
    
}
