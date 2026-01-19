import java.util.*;
public class bubblesort{
    public static void main(String args[]){
        int array[] = {2,4,7,3,1,5,6};
        bubble_sort(array);
        printarray(array);
    }
    public static void bubble_sort(int array[]){
        int n = array.length;
        int swapcount = 0;
        
        for(int i=0;i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-1-i;j++){
                if (array[j]>array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapcount++;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
        System.out.println("Total Swap Count: "+swapcount);
    }
    public static void printarray(int array[]){
        System.out.print("The Sorted array is: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");

        }
    }
}