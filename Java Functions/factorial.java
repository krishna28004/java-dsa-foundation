import java.util.*;
public class factorial {
    public static int fact(int num1){
        int ans=1;
        for(int i =1; i<=num1;i++){
        ans = ans*i;
    }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int n =sc.nextInt();
        int answer =  fact(n);
        System.out.print("factorial is: "+ answer);
    }
}
