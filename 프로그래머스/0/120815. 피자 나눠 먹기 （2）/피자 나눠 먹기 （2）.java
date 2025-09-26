class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizzaCount = 1;
        if(n % 6 == 0){
            answer = n / 6;
        }else{
            while(true){
                if((pizzaCount * 6) % n == 0){
                    break;
                }
                pizzaCount++;
            }
            answer = pizzaCount;
        }
        return answer;
    }
}