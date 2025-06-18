class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int start = 0, end = 0;
        
        for(int i = 0; i < my_strings.length; i++){
            start = parts[i][0];
            end = parts[i][1];
            
            answer += my_strings[i].substring(start, end+1);
            // System.out.println(my_strings[i]);
        }
        
        return answer;
    }
}