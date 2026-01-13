import java.util.*;
public class binary_to_decimal {
    public static int binary_to_decimal(int n){
       int i = 0;
       int dec = 0;
        while (n>0) {
            int ld = n%10;
            dec = dec + ld*(int)(Math.pow(2,i));
            n=n/10;
            i++;
        } return dec;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number: ");
        int num = sc.nextInt();

        int decimal = binary_to_decimal(num);
        System.out.print("Decimal form of " +num+" is: "+decimal);
    }

} 

    

