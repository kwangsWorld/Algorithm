import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        
        for(char c : charArr){
            list.add(c);
        }
        
        Arrays.sort(indices);
        for(int i = indices.length-1; i >= 0; i--){
            list.remove(indices[i]);
        }
        
        
        
        StringBuilder sb = new StringBuilder();
        for(char c : list){
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}