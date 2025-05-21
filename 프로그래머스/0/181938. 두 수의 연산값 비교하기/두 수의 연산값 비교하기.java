class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String result1 = a + "" + b;
        String result2 = (a * b * 2) + "";
        
        int finalResult1 = Integer.parseInt(result1);
        int finalResult2 = Integer.parseInt(result2);
        
        if(finalResult1 > finalResult2){
            answer = finalResult1;
        }else if(finalResult1 < finalResult2){
            answer = finalResult2;
        }else{
            answer = finalResult1;
        }
        
        return answer;
    }
}