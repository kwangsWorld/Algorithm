class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length;
        
        for(int i = 0; i < n; i++){
            if(included[i] == true){
                answer += a;
            }
            // System.out.println("등차수열의 " + (i+1) + "번째의 a의 값: " + a);
            a += d;
        }
        return answer;
    }
}