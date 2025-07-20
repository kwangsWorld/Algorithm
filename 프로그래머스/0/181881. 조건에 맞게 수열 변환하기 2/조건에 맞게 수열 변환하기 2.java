class Solution {
    public int solution(int[] arr) {
        int noChange;
        int count = 0;
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        
        while(true){
            noChange = 0;
            for(int i = 0; i < answer.length; i++){
                if(answer[i] >= 50 && answer[i] % 2 == 0){
                    answer[i] /= 2; 
                }else if(answer[i] < 50 && answer[i] % 2 == 1){
                    answer[i] = (answer[i] * 2) + 1;
                }else{
                    noChange++;
                }
            }
            if(noChange == answer.length){
                break;
            }else{
                count++;
            }
        }
        
        return count;
    }
}