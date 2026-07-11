public class firstOccurance {
    public static void main(String args[]){
        int arr[]={2,4,6,8,9,8,4,6};
        int num = 8;
        //to find the index of first occurance of number 8
        System.out.println(OccuranceAt(arr,num,0));
    }

    public static int OccuranceAt(int arr[], int num, int i){
        if(arr[i]==num){
            return i;
        }
        return OccuranceAt(arr, num, i+1);

    }
}
