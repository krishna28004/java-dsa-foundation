public class printBinaryString {
    public static void main(String[] args) {
        int n = 10;
        
        printBinary(n,"",0);
    }

    public static void printBinary(int n, String str, int lastPlace) {
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinary(n-1, str+"0", 0); 
        if(lastPlace==0){
            printBinary(n-1, str+"1", 1);
        }
    }
}
