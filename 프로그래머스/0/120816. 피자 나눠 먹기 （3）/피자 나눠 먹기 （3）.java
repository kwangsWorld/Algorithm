class Solution {
    public int solution(int slice, int n) {
        int pizza = 0;
        if(slice >= 2 && slice <= 10 && n >= 1 && n <= 100){

            if(n % slice == 0){
                return n / slice;
            }else{
                for(int i = 1; i <= n; i++){
                    if((slice * i) / n >= 1){
                        pizza = i;
                        break;
                    }
                }
            }
        }
        return pizza;
    }
}