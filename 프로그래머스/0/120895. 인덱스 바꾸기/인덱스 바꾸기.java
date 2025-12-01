class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        char ch = charArr[num1];
        charArr[num1] = charArr[num2];
        charArr[num2] = ch;
        
        for(int i = 0; i < charArr.length; i++){
            answer += charArr[i];
        }
        
        return answer;
    }
}