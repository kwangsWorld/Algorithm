class Solution {
    public String solution(String my_string, int s, int e) {
        char[] answer = my_string.toCharArray();
        char tempt;
        
        while(s < e){
            tempt = answer[s];
            answer[s] = answer[e];
            answer[e] = tempt;
            s++;
            e--;
        }
        
        return new String(answer);
    }
}