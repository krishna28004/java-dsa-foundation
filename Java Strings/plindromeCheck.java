// import java.util.*;
// public class plindromeCheck{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         String rev = "";
//         System.out.print("Enter the Word: ");
//         String enterWord = sc.next();
//         for(int i=enterWord.length()-1;i>=0;i--){
//             rev = rev + enterWord.charAt(i);
//         }
//         if (rev.equals(enterWord)){
//             System.out.print("Yes Palindrom");
//         } else {System.out.print("not palindrome");}
// }


import java.util.*;
public class plindromeCheck{
    public static boolean palindrom(String word){
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i) !=word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true; 
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.next();
        System.out.print(palindrom(word));

    }
}