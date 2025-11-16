import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int number = n;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            if(number % i == 0){
                while(number % i == 0){
                    number = number / i;
                }
                list.add(i);
            }
        }
        
        answer = new int[list.size()];
        int idx = 0;
        for(int i : list){
            answer[idx++] = i;
        }
        
        
        return answer;
    }
}