//Given path - WNEENESENNN, find the shortest path to reach 

import java.util.*;
public class shortestPath {
    public static float displacement(String path){
        int x = 0;
        int y = 0;
        for(int i=0;i<path.length();i++){
            if (path.charAt(i) == 'S'){
                y--;
            }
            else if(path.charAt(i) == 'N'){
                y++;
            }
            else if(path.charAt(i) == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(displacement(path));
        
    }

}







// import java.util.*;
// public class shortestPath {
//     public static void displacement(int x1,int x2,int y1,int y2){
//         double xdiffsq = Math.pow((x2-x1),2);
//         double ydiffsq = Math.pow((y2-y1),2);
//         double sum = xdiffsq + ydiffsq;
//         System.out.print(Math.sqrt(sum));
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter x1: ");
//         int x1 = sc.nextInt();
//         System.out.print("Enter x2: ");
//         int x2 = sc.nextInt();
//         System.out.print("Enter y1: ");
//         int y1 = sc.nextInt();
//         System.out.print("Enter y2: ");
//         int y2 = sc.nextInt();

//         displacement(x1,x2,y1,y2);
//     }
// }



