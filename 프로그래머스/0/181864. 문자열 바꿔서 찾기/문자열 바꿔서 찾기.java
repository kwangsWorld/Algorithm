class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.replace('A','#');
        str = str.replace('B','A');
        str = str.replace('#','B');
        if(str.contains(pat)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}