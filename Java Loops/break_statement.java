import java.util.*;
public class break_statement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        do {
            int n= sc.nextInt();
            
            if (n%10==0){
            break;}
         System.out.println("Entered" + n);
        } while (true);

    }
    
}
