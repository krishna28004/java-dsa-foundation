import java.util.*;
public class input_while {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want to Print: ");
        int n=sc.nextInt();
        int i=0;
        while (i<=n){
            System.out.print(" "+i);
            i++;
        }
    }

}
    

