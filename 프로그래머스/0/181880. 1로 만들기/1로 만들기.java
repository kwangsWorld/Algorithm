class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num = 0;
        
        for(int i = 0; i < num_list.length; i++){
            num = num_list[i];
            for(int j = num; j > 1;){
                if(j % 2 == 0){
                    j /= 2;
                    answer++;
                }else{
                    j = (j - 1) / 2;
                    answer++;
                }
            }
        }
        
        return answer;
    }
}