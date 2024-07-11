class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = 1;
        int count = 0;
        while(true){
            if(number * number == n){
                count++;
                break;
            }
            if(number * number > 1000000){break;}
            number++;
        }
        if(count == 1){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}