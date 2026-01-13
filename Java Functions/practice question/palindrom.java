import java.util.*;
public class palindrom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num =sc.nextInt();
        checkpalindrom(num);
    }
    public static void checkpalindrom(int n){
        int orignal = n;
        int rev = 0;
        while (n>0){
            int ld = n%10;
            rev = ld + 10*rev;
            n = n/10;
        }
        if (rev == orignal){
            System.out.print("Palindrom");}
            else
             {System.out.print("Not a Palindrom");
            }
        }
    }

