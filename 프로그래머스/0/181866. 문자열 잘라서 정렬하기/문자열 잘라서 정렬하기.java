import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> al = new ArrayList<String>();
        
        for(String str : answer){
            al.add(str);
        }
        
        for(int i = 0; i < al.size();){
            if(al.get(i).equals("")){
                al.remove(i);
            }else{
                i++;
            }
        }
        
        answer = new String[al.size()];
        
        for(int i = 0; i < al.size(); i++){
            answer[i] = al.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}