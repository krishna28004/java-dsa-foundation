import java.util.*;

public class swap2Numbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target Index");
        int index1 = sc.nextInt();
        System.out.println("Enter the Index replaced by");
        int index2 = sc.nextInt();

        System.out.println(list);
        swap(list, index1, index2);
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}