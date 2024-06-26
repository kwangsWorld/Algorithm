class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i = 0; i <= cipher.length(); i++){
            if(i == 0){continue;}
            if(i % code == 0){
                // System.out.println("실행됐을 때의 i값 :" + i);
                // System.out.println("실행됐을 때의 문자열 값 :" + cipher.charAt(i-1));
                answer += cipher.charAt(i-1);
            }
        }
        return answer;
    }
}