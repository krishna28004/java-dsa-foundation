public class swap2numbers{
    public static void main(String[] args) {
        // int a=3;
        // int b=5;
        // b = a+b;
        // a=b-a;
        // b=b-a;
        // System.out.println(a);
        // System.out.println(b);

        int a = 5;
        int b = 10;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}

