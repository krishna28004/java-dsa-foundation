import java.util.*;
    public class largest_of_three{
        public static void main(String args[]){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first Number:");
            int input1 = sc.nextInt();
            System.out.println("Enter the second Number:");
            int input2 = sc.nextInt();
            System.out.println("Enter the third Number:");
            int input3 = sc.nextInt();
            if (input1>input2 && input1>input3){
            System.out.println("-------------------\nResult: First number is Grestest: " + input1 );}
            else if (input2>input1 && input2>input1){
            System.out.println("-------------------\nResult: Second number is Grestest: " + input2 );}
            else
            System.out.println("-------------------\nResult: Third number is Grestest :" + input3 );
        }
    }
            