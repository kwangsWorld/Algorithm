class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        int count = 0;
        
        
        for(int i = 1; i < numLog.length; i++){
            if(numLog[i] - numLog[i-1] == 1){
                answer += 'w';
            }else if(numLog[i] - numLog[i-1] == -1){
                answer += 's';
            }else if(numLog[i] - numLog[i-1] == 10){
                answer += 'd';
            }else{
                answer += 'a';
            }
            
            // System.out.println("numLog[" + (i-1) + "] 의 값은 "+ numLog[i-1] + "이고, " + 
            //                     "numLog[" + i + "] 의 값은 "+ numLog[i] + "이다.");
        }
        return answer;
    }
}