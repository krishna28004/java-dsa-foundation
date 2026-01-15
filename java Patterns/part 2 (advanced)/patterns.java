import java.util.*;
public class patterns{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int columns = sc.nextInt();
        diamond(row);
    }

    public static void invertedstar(int row,int column){
        for (int i=1; i<=row;i++){
                //spaces
            for(int j=1; j<=row-i;j++){
                 System.out.print(" ");}
                //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
                 }System.out.println();        
    }
}


    public static void squarepattern(int row, int column){
        for(int i=1; i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==row || j==column || i==1 || j ==1){
                    System.out.print("*");
                } else { System.out.print(" ");}
            }System.out.println();
        }
    }

    public static void numtriangle(int row ){
        for(int i=0;i<row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(j+ " ");        
            }
            System.out.println();
        }
    }

    public static void floydtringle(int row){
        int counter=1;
        for (int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                counter++;
            } 
            System.out.println();
        }
    }

    public static void binarytriangle(int row){
        for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            if ((j+i)%2==0){
                System.out.print(" 1 ");
            } else {
                System.out.print(" 0 ");
            }
          } System.out.println();
      }
    }

    public static void butterfly(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*(row-i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("* ");
            } System.out.println();
        } 
    
    for(int i=row;i>=1;i--){
        for(int j=1;j<=i;j++){
                System.out.print("* ");
        }
        for(int k=1;k<=2*(row-i);k++){
                System.out.print("  ");
            }
        for(int l=1;l<=i;l++){
                System.out.print("* ");
            } System.out.println();
        }
    }

    public static void solidrhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=(n-i);j>=0;j--){
            System.out.print("  ");
            }
            for(int k=1;k<=n;k++){
            System.out.print("* ");
            }             System.out.println();
        }
    }

    public static void hollowrhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=(n-i);j>=1;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++){
                if(k==1 || k==n || i==1 || i==n){
                    System.out.print("*  ");  
                }else  System.out.print("   ") ;
            }System.out.println();
        } 
    }

    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=(n-i);j>=0;j--){
                System.out.print("  ");
            } for (int k=1;k<=((2*i)-1);k++){
                    System.out.print("* ");
            }System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=(n-i);j>=0;j--){
                System.out.print("  ");
            } for (int k=1;k<=((2*i)-1);k++){
                    System.out.print("* ");
            }System.out.println();
        }
    }
}   
