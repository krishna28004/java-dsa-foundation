import java.util.*;
public class prime_in_range {

    public static boolean prime(int a){
        boolean isTrue = true;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;                 
            }
       }
       return true;
    }

    public static void primeinrange(int a){
        for (int i=2;i<=a;i++){
            if(prime(i)){
                System.out.print(i + " ");
            }

        } System.out.println();
    }
    public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter number for range in Prime : ");
    int no = sc.nextInt();
    primeinrange(no);
    }
}
