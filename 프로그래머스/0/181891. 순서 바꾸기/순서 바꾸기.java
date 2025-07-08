import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] sliced1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] sliced2 = Arrays.copyOfRange(num_list, 0, n);
        int idx = 0;
        
        
        for(int i = 0; i < sliced1.length; i++){
            answer[idx++] = sliced1[i];
        }
        
        for(int i = 0; i < sliced2.length; i++){
            answer[idx++] = sliced2[i];
        }

        return answer;
    }
}