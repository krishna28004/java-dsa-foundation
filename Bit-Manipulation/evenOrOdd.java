public class evenOrOdd{
    public static void main(String[] args) {
        int num = 234;
        int cal = num&1;
        if(cal==1){
            System.out.println("The number is odd");
        }else{
            System.out.println("The number is Even");
        }
    }
}