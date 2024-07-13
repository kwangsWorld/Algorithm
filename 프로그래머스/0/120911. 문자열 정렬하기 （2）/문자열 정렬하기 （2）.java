import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        return sortString(answer);
    }
    
    public String sortString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}