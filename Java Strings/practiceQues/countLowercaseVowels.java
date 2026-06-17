public class countLowercaseVowels {
    public static void main(String args[]){
        String str = "Krishnakumar";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch=='a' || ch == 'e' || ch == 'i' ||  ch == 'i' ||  ch == 'o' ||  ch == 'u' ) && Character.isLowerCase(ch)){
                count++;
            }
        }System.out.println(count);
    }
}

