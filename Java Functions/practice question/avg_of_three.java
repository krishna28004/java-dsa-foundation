import java.util.*;
public class avg_of_three{


    //QUESTION-1 
    public static void average(int a,int b,int c){
        int avg = (a+b+c)/3;
        System.out.print("Average: " + avg);
    }

    //QUESTION-5 
    public static void sumofdigit(int n){
        int sum = 0;
        while (n>0){
        int rem = n%10;
        sum = sum + rem;
        n = n/10;
        } System.out.print("The sum of digits : " +sum);
    }

    //QUESTION-2
    public static boolean checkifeven(int n){
        if (n%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        if(checkifeven(x)) {
            System.out.print("Number is Even.");
        } else {
            System.out.print("Number is Odd.");
        }
  }
  }
