import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int number = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String i : intStrs){
            number = Integer.parseInt(i.substring(s,s+l));
            if(number > k){
                list.add(number);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
}