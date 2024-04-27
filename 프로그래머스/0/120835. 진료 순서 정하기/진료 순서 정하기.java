import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++){
            temp[i] = emergency[i];
        }
        
        Arrays.sort(temp);
        
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp.length; j++){
                if(temp[i] == emergency[j]){
                    answer[j] += temp.length - i;
                }
            }
        }
        return answer;
    }
}