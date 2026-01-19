public class insertionsort {
    public static void main(String args[]){
        int array[] = {4,5,3,2,6,7,1};
        insertion_sort(array);
        printarray(array);
    }

    public static void insertion_sort(int array[]) {
        for(int i=1;i<array.length;i++){
            int curr = array[i] ;
            int prev = i-1;
            //finding out correct position
            while (prev>=0 && array[prev]>curr) {
                array[prev+1] = array[prev];
                prev--;
            }
            //insertion
            array[prev+1] = curr;
        }
    }

    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
