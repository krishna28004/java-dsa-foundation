public class optimisedXPowerN{
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        int ans = XpowerN(x,n);
        System.out.print(ans);
    }

    public static int XpowerN(int x, int n){
        if(n==0){
            return 1;
        }
        int cal = XpowerN(x, n/2)*XpowerN(x, n/2);
        if(n%2!=0){
            cal = x*cal;
        }
        return cal;

    }
}