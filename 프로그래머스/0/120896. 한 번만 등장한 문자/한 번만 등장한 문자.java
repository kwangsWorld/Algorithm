import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int firstIdx = s.indexOf(ch);
            int secondIdx = s.indexOf(ch, firstIdx+1);
            
            if(secondIdx == -1){
                answer += ch;
            }else{
                continue;
            }
        }
        
        char[] charArr = answer.toCharArray();
        Arrays.sort(charArr);
        answer = String.valueOf(charArr);
        
        return answer;
    }
}