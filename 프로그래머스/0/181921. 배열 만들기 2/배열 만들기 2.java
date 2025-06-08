class Solution {
    public int[] solution(int l, int r) {
        
        int[] answer = {};
        int n;
        int idx = 0;
        int count = 0;
        
        for(int i = l; i <= r; i++){
            n = 0;

            String str = Integer.toString(i);
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '5' || str.charAt(j) == '0'){
                    n++;
                    if(n == str.length()){
                        count++;
                    } 
                }else{
                    break;
                }
                
            }
        }
        
        answer = new int[count];
        if(count == 0){
            return new int[]{-1};
        }
        
        idx = 0;
        
        for(int i = l; i <= r; i++){
            n = 0;

            String str = Integer.toString(i);
            // System.out.println(i);
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '5' || str.charAt(j) == '0'){
                    n++;
                    if(n == str.length()){
                        answer[idx] = i;
                        idx++;
                    } 
                }else{
                    break;
                }
                
            }
        }
        return answer;
    }
}