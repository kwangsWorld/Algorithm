class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = k;
        
        if(numbers.length % 2 == 0){
            for(int i = 0; i < numbers.length; i+=2){
                answer = numbers[i];
                count --;
                if(i == numbers.length-2){
                    i = -2;
                }if(count == 0){
                    break;
                }
            }
        }else{
            for(int i = 0; i < numbers.length; i+=2){
                answer = numbers[i];
                count --;
                if(i == numbers.length-1){
                    i = -1;
                }else if(i == numbers.length-2){
                    i = -2;
                }
                if(count == 0){
                    break;
                }
            }
        }
        
        return answer;
    }
}