public class factorial{
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }

    public static int fact(int num){
        if(num==0){
            return 1;
        }
        int fact_n_minus_1 = fact(num-1);
        int fact_n = num * fact(num-1);
        return fact_n;
    }
}

