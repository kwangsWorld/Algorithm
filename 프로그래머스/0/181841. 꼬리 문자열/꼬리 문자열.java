import java.util.ArrayList;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].contains(ex)){
                continue;
            }else{
                list.add(str_list[i]);
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        
        
        return answer;
    }
}