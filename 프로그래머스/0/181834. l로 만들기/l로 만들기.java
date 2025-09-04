class Solution {
    public String solution(String myString) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(myString);
        
        for(int i = 0; i < myString.length(); i++){
            if(sb.charAt(i) < 'l'){
                sb.setCharAt(i, 'l');
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}