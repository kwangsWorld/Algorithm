import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(n);
        
        while(true){
            if(n % 2 == 0){
                n = n / 2;
                list.add(n);
            }else if(n == 1){
                break;
            }else{
                n = (n * 3) + 1;
                list.add(n);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}