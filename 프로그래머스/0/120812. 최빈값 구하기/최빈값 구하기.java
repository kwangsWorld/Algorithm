import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = -1;
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : array){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int maxValue = -1;
        
        for(int key : countMap.keySet()){
            int value = countMap.get(key);
            
            if(value > maxValue){
                maxValue = value;
                answer = key;
            }else if(value == maxValue){
                answer = -1;
            }
        }
        
        
        return answer;
    }
}