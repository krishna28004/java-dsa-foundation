public class ithPosition {
    public static void main(String args[]){
        int n=8;
        int i=2;
        getIthPosition(n, i);
        System.out.println(setIthPosition(n, i));
        System.out.println(clearIthPosition(n, i));
        System.out.println(updateIthPosition(n, i,1));
        System.out.println(clearLastIBits(n, i));
        System.out.println(clearIBits(n=15, i=3,7));
        

    }


    public static void getIthPosition(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            System.out.println("0");
        }
        else{
            System.out.print("1");
        }
    }

    public static int setIthPosition(int n, int i) {
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clearIthPosition(int n, int i) {
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int updateIthPosition(int n, int i, int newbit) {
        n = clearIthPosition(n, i);
        int bitmask =newbit<<1;
        return n|bitmask;
    }

    public static int clearLastIBits(int n, int i) {
       int bitmask = (~0)<<i;
       return n&bitmask;
    }

    public static int clearIBits(int n, int i, int j) {
       int a = (~0)<<(j+1);
       int b = (1<<i)-1;
       int bitmask = a|b;
       return n&bitmask;
    }
}
