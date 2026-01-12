    import java.util.*;
    public class Taxcalculator {
        public static void main(String args[]){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Salary:");
            int input = sc.nextInt();
            int tax1= (input*20)/100;
            int tax2= (input*30)/100;
            if (input<500000)
            System.out.println("You don't have to pay any Tax");
            else if (input>500000 && input<1000000){
            
            System.out.println("You have to pay 20% Tax of your Salary that is :\n"+tax1 );}
            else {
            System.out.println("You have to pay 30% Tax of your Salary that is :\n"+tax2 );}
        }
    }