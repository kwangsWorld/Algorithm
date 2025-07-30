import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        ArrayList<String> list = new ArrayList<String>();
        
        for(String i : strArr){
            if(i.indexOf("ad") == -1){
                list.add(i);
            }
        }
        
        answer = list.toArray(new String[0]);
        
        return answer;
    }
}