import java.util.*;
public class prime_in_range {
    public static void prime(int a){
        boolean isTrue = true;
        for(int i=2;i<=(a-1);i++){
    
            if(a%i==0){
                isTrue = false;                 
            }
       }  if (isTrue==true)
            System.out.print("prime number");
            else System.out.print("Not a prime number"); 
    }
    public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter number: ");
    int no = sc.nextInt();
    prime(no);
}
