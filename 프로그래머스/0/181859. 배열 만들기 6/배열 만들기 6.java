import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length;i++){
            if(list.size() == 0){
                list.add(arr[i]);
            }else if(list.size() > 0 && list.get(list.size() - 1) == arr[i]){
                list.remove(list.size() - 1);
            }else{
                list.add(arr[i]);
            }
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        if(answer.length == 0){
            return new int[]{-1};
        }
        return answer;
    }
}