class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int lidx = -1;
        int ridx = -1;
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                lidx = i;
                break;
            }
        }
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("r")){
                ridx = i;
                break;
            }
        }
        
        if(lidx != -1 && (ridx == -1 || lidx < ridx)){
            answer = new String[lidx];
            for(int i = 0; i < lidx; i++){
                answer[i] = str_list[i];
            }
        }
        if(ridx != -1 && (lidx == -1 || lidx > ridx)){
            answer = new String[str_list.length - ridx - 1];
            for(int i = 0; i < answer.length; i++){
                answer[i] = str_list[ridx + 1 + i];
            }
        }
        if(lidx == -1 && ridx == -1){
            answer = new String[0];
        }
        
        return answer;
    }
}