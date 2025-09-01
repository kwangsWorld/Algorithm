class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int ameCnt = 0;
        int cafeCnt = 0;
        
        for(String str : order){
            if(str.contains("ame") || str.contains("any")){
                ameCnt++;
            }else{
                cafeCnt++;
            }
        }
        
        answer = ameCnt * 4500 + cafeCnt * 5000;
        
        return answer;
    }
}