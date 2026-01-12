import java.util.*;
public class switch_statement
 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Choice (1,2,3,4)");
    int input = sc.nextInt();
    switch(input){
        case 1:System.out.println("Samosa");
        break;
        case 2:System.out.println("Momos");
        break;
        case 3:System.out.println("Pizza");
        break;
        case 4:System.out.println("Burger");
        }
    
    }
}
