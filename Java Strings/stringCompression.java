public class stringCompression {
    public static void main(String args[]){
        String str = "aabbbssscccccc";
        String newstr = "";

        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            }
            newstr += str.charAt(i); 
            if(count>1){
                newstr += count.toString();
            }
        }
        System.out.println(newstr);
        
    }
}


// firstly make an empty string
// then for loop till the length of given string
//     inside it initialise the count as 1 for starting 
//           then make a while loop inside that compare that i<length-1, i==i+1
//          if this situation matches i++ and count++
//     then in same for_loop append character at i to manully made string
//     then check condition if count>1 
//     append count value to our made string






