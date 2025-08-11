import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        
        int[] answer = new int[k];
        int idx = 0;
        
        for(int num : set){
            if(idx >= k){break;}
            answer[idx++] = num;    
        }
        
        while(idx < k){
            answer[idx++] = -1;
        }

        return answer;
    }
}