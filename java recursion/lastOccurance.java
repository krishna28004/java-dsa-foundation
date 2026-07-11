public class lastOccurance {
    public static void main(String[] args) {
        int arr[] = {2,4,7,8,5,3,4,2,5,3};
        int num=2;
        System.out.print(occuranceAt(arr,num,arr.length-1));
    }

    public static int occuranceAt(int arr[], int num, int i){
        if(arr[i]==num){
            return i ;
        }
        return occuranceAt(arr, num, i-1);
    }
}
