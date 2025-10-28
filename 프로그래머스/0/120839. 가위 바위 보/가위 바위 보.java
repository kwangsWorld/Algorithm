class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] charArr = rsp.toCharArray();
        
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == '2'){
                answer += '0';
            }else if(charArr[i] == '0'){
                answer += '5';
            }else{
                answer += '2';
            }
        }
        return answer;
    }
}