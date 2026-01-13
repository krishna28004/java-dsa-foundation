import java.util.*;
public class binomial{
    public static int binomialfactorial(int n, int r){
        int fact_n = 1;
        for(int i=1;i<=n;i++){
                fact_n = fact_n*i;
        }
        int fact_r = 1;
        for(int i=1;i<=r;i++){
                fact_r = fact_r*i;
        }
        int fact_nr = 1;
        for(int i=1;i<=(n-r);i++){
                fact_nr = fact_nr*i;
        }
        
        int ans = fact_n/((fact_r)*fact_nr);
        return ans;
        
    }
    public static void primenumber(int a){
        boolean isprime=true;
        for(int i=2;i<=a-1;i++){
            if (a%i==0){
                isprime=false;}
        }   
            if(isprime=true){
                System.out.print( "Number " +a+ " is Prime.");}
            else {System.out.print("Number"  +a+ " is not Prime.");}
        
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for calculating Binomial: ");
        int a =sc.nextInt();
        System.out.print("Enter r for calculating Binomial: ");
        int b =sc.nextInt();
        binomialfactorial(a,b);
        int ans= binomialfactorial(a,b);
        System.out.println("The Binomial Factorial for "+a+"C"+b+" is: " + ans);
        primenumber(a);
    }
}
