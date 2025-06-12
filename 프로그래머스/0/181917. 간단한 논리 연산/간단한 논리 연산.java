class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean result1 = true;
        boolean result2 = true;    
        
        if(x1 == true || x2 == true){
            result1 = true;
        }else{
            result1 = false;
        }
        
        if(x3 == true || x4 == true){
            result2 = true;
        }else{
            result2 = false;
        }
        
        if(result1 == false || result2 == false){
            answer = false;
        }else{
            answer = true;
        }
        return answer;
    }
}