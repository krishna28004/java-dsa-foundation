import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        int array[] = {4,5,6,1,3,2,7};
        selectionsort(array);
        printarray(array);
    }

    public static void selectionsort(int array[]){
        int n = array.length;
        
        for(int i=0;i<n-1;i++){
            int minpos = i;
            for(int j=i+1;j<n;j++){
                if(array[minpos]>array[j]){
                    minpos = j;
                }
            }

            int temp = array[minpos];
            array[minpos] = array[i];
            array[i] = temp;
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
    
}