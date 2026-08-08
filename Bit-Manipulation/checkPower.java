public class checkPower {
    public static void main(String[] args) {
        int num = 14;
        System.out.print(CheckPowerOf2(num));
    }

    public static boolean CheckPowerOf2(int num){
        return (num&(num-1))==0;
    }
}
