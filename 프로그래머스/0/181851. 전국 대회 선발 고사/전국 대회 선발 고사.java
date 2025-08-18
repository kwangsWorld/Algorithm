import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int idx = 0;
        int count = 0;
        
        for(int i = 0; i < attendance.length; i++){
            if(attendance[i] == true){
                count++;
            }
        }
        
        int[] yesRank = new int[count];
        
        for(int i = 0; i < rank.length; i++){
            if(attendance[i] == true){
                yesRank[idx++] = rank[i];
            }
        }
        
        Arrays.sort(yesRank);
        
        for(int i = 0; i < rank.length; i++){
            if(yesRank[0] == rank[i]){
                answer += 10000 * i;
            }
            if(yesRank[1] == rank[i]){
                answer += 100 * i;
            }
            if(yesRank[2] == rank[i]){
                answer += i;
            }
        }
        
        
        return answer;
    }
}