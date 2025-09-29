class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int pizzaCount = 1;
        if(n % slice == 0){
            answer = n / slice;
        }else{
            if(n < slice){
                answer = 1;
            }else{
                while(true){
                    if(n <= slice * pizzaCount){
                        break;
                    }
                    pizzaCount++;
                }
                answer = pizzaCount;
            }
        }
        return answer;
    }
}