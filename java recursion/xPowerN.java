import java.util.*;
public class xPowerN {
    public static void main(String[] args) {
        int x=8;
        int n=3;
        System.out.print(xpowern(x,n));
    }

    public static int xpowern(int x, int n){
        if(n==0){
            return x;
        }
        return x*(xpowern(x,n-1));
    }
}
