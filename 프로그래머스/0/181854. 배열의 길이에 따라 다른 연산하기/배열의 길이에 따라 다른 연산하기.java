class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[i];
        }
        
        if(arr.length % 2 == 1){
            for(int i = 0; i < answer.length; i+=2){
                answer[i] += n;
            }
        }else{
            for(int i = 1; i < answer.length; i+=2){
                answer[i] += n;
            }
        }
        
        return answer;
    }
}