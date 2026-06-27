//:Print the sum, difference and product of two complex numbers by creating a class named 'Complex'with
// separate methods for each operation whose real and imaginary parts are entered by the user

import java.util.*;
public class practice1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part a1: ");
        int a1 = sc.nextInt();
        System.out.println("Enter the imaginary part b1: ");
        int b1 = sc.nextInt();
        System.out.println("Enter the real part a2: ");
        int a2 = sc.nextInt();
        System.out.println("Enter the real part b2: ");
        int b2 = sc.nextInt();
        System.out.println("first number:" + a1 + "+" + b1 + "i" );
        System.out.println("first number:" + a2 + "+" + b2 + "i" );

        add a = new add();
        a.addis(a1,b1,a2,b2);
        sub s = new sub();
        s.subis(a1,b1,a2,b2);
        mul m = new mul();
        m.mulis(a1,b1,a2,b2);
    }
}


class mul{
    int real;
    int imag;
    void mulis(int a1,int b1,int a2,int b2){
        real = a1*a2;
        imag = b1*b2;
        System.out.println(real+" "+ "+"+" "+ imag+"i");
    }
}

class add{
    int real;
    int imag;
    void addis(int a1,int b1,int a2,int b2){
        real = a1+a2;
        imag = b1+b2;
        System.out.println(real+" "+ "+"+" "+ imag+"i");
    }
}
class sub{
    int real;
    int imag;
    void subis(int a1,int b1,int a2,int b2){
        real = a1-a2;
        imag = b1-b2;
        if(b1-b2>0){
            System.out.println(real+" "+ "+"+" "+ imag+"i");
        }else{
            System.out.println(real+" "+ "-"+" "+ Math.abs(imag)+"i");
        }
    }
}

