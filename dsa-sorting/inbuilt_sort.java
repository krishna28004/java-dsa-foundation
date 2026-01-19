import java.util.Arrays;
public class inbuilt_sort {
    public static void main(String[] args) {
        int arr[] = {4,6,5,3,2,1,7};
        Arrays.sort(arr);               //inbuilt sort function 
        printarray(arr);
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
