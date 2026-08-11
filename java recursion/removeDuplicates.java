public class removeDuplicates {
    public static void main(String[] args) {
        String word = "krishnakumar";
        StringBuilder newString = new StringBuilder();
        boolean map[] = new boolean[26];
        removeDuplicate(word,0,newString,map);
    }

    public static void removeDuplicate(String word, int idx, StringBuilder newString, boolean map[]) {
        if(idx == word.length()){
            System.out.println(newString);
            return;
        }

        char currChar = word.charAt(idx);
        if(map[currChar-'a'] == true ){
            removeDuplicate(word, idx+1, newString, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicate(word, idx, newString.append(currChar), map);
        }



    }
}
