import java.util.*;
public class nthFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        System.out.print("The "+num+"th Fibonacci number is: " + fibonacci(num-1));
    }

    public static int fibonacci(int num){
        //0,1,1,2,3,5,8,13,21,34...
        if(num ==0){
            return 0;
        } else if(num==1){return 1;}

        int ans = fibonacci(num-1)+fibonacci(num-2);
        return ans;
    }
}
