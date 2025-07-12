class Solution {
    public String[] solution(String[] names) {
        int idx = 0;
        int length = 0;
        if(names.length % 5 != 0){
            length = (names.length/5)+1;
        }else{
            length = names.length / 5;
        }
        String[] answer = new String[length];
        
        
        for(int i = 0; i < names.length; ){
            answer[idx] = names[i];
            i += 5;
            idx++;
        }
        return answer;
    }
}