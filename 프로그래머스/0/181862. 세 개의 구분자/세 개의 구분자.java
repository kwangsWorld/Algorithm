import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] strArr = {};
        strArr = myStr.split("[abc]");
        
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].equals("")){
                list.add(strArr[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        if(answer.length == 0){
            return new String[]{"EMPTY"};
        }else{
            return answer;
        }
    }
}