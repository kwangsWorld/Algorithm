import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++){
            if(flag[i] == true){
                for(int j = 0; j < arr[i]*2; j++){
                    list.add(arr[i]);
                }
            }else {
                int removeCount = Math.min(arr[i], list.size());
                int start = list.size() - removeCount;

                for (int j = list.size() - 1; j >= start; j--) {
                    // 여기서 j가 음수가 되는 걸 막기 위한 보조 조건
                    if (j >= 0 && j < list.size()) {
                        list.remove(j);
                    }
                }
            }
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}