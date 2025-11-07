import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int answerLength = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 47 && my_string.charAt(i) <= 57){
                list.add(my_string.charAt(i) - '0');
                answerLength++;
            }
        }
        answer = new int[answerLength];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}