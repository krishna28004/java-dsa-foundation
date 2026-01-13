import java.util.*;
public class decimal_to_binary {

    public static void decimaltobinary(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        int i = 0;
        int binnum = 0;
        while (n > 0) {
            int rem = n % 2;
            binnum = binnum + rem * (int) (Math.pow(10, i));
            i++;
            n = n / 2;
        }System.out.print(binnum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        int num = sc.nextInt();
        decimaltobinary(num);
        sc.close();
    }
}
