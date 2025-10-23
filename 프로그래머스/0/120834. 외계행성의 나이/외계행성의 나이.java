class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = Integer.toString(age);
        char[] charArr = str.toCharArray();
        
        for(int i = 0; i < charArr.length; i++){
            answer += (char)(charArr[i] + 49);
        }
        
        return answer;
    }
}