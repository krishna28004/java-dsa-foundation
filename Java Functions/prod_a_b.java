// import java.util.*;
// public class prod_a_b {
//     public static void product(int num1,int num2){
//         int prod= num1*num2;
//         System.out.print("The product of numbers: " + prod);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         product(a,b);
//     }
    
// }




import java.util.*;
public class prod_a_b {
    public static void prodis(int a, int b){
        int prod = a * b;
        System.out.println("The product is : " + prod );
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        prodis(a,b);

    }
}