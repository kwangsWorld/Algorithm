class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1, str2;
        String result1, result2;
        
        str1 = Integer.toString(a);
        str2 = Integer.toString(b);
        
        result1 = str1 + str2;
        result2 = str2 + str1;
        
        
        // System.out.println("a = " + a + ", b = " + b);
        // System.out.print("result1 = " + result1 + ", result2 = " + result2);
        
        if(Integer.parseInt(result1) > Integer.parseInt(result2)){
            answer = Integer.parseInt(result1);
        }else{
            answer = Integer.parseInt(result2);
        }
        
        return answer;
    }
}