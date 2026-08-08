public class countSetBits {
    public static void main(String[] args) {
        int num = 30;
        System.out.println(countset(num));
    }

    public static int countset(int num) {
        int count = 0;
        while(num>0){
            if((num&1)!= 0){
            count++;
            }
        num=num>>1;
        }
        return count;
    }
}
