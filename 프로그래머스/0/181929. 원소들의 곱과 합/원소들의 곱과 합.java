class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num_mul = 1;
        int num_sum = 0;
        
        for(int i = 0; i < num_list.length; i++){
            num_mul *= num_list[i];
            num_sum += num_list[i];
        }
        
        if(num_mul < Math.pow(num_sum, 2)){
            answer = 1;
        }
        
        return answer;
    }
}