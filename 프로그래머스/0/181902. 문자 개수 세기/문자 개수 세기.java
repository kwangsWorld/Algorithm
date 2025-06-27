import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        ArrayList<Integer> list = new ArrayList<>();
        char[] charArr = my_string.toCharArray();
        int count;
        
        for(int i = 65; i <= 122; i++){
            count = 0;
            for(int j = 0; j < charArr.length; j++){
                if(charArr[j] == (char)i){
                    count++;
                }
            }
            list.add(count);
            if(i == 90){
                i = 96;
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}