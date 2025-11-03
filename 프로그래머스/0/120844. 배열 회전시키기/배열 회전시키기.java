class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            int num = numbers[numbers.length-1];
            for(int i = 0; i < answer.length - 1; i++){
                answer[i+1] = numbers[i];
            }
            answer[0] = num;
        }else{
            int num = numbers[0];
            for(int i = 0; i < answer.length - 1; i++){
                answer[i] = numbers[i+1];
            }
            answer[answer.length-1] = num;
        }
        
        return answer;
    }
}