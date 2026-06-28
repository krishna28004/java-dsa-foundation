public class basics{
    public static void main(String args[]){
        int num = 10;
        printdec(num);
        printinc(num);
    }

    public static void printdec(int num){
        if(num==1){
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        printdec(num-1);
    }

    public static void printinc(int num){
         if(num==1){
                System.out.print(num+" ");
                return;
            }
        printinc(num-1);
        System.out.print(num + " ");
    }
}