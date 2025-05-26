class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals("<")){
            if(eq.equals("=")){
                answer = n <= m ? 1 : 0;
                // System.out.println(n + " <= " + m + " = " + answer);
            }else{
                answer = n < m ? 1 : 0;
                // System.out.println(n + " = " + m + " = " + answer);
            }
        }else{
            if(eq.equals("=")){
                answer = n >= m ? 1 : 0;
                // System.out.println(n + " >= " + m + " = " + answer);
            }else{
                answer = n > m ? 1 : 0;
                // System.out.println(n + " > " + m + " = " + answer);
            }
        }
        
        return answer;
    }
}