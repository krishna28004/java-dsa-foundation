import java.util.*;
public class nNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Sum of first "+num+" natural number is: "+printNatural(num));
    }

    public static int printNatural(int num){
        if(num == 1){
            return 1;
        }
        int nm1 = printNatural(num-1);
        int sn = num + nm1;
        return sn;
    }
}
