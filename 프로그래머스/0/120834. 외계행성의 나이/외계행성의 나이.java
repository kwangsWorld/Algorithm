class Solution {
    public String solution(int age) {
        String str = Integer.toString(age);
        String answer = "";
        for(int i = 0; i < str.length() ; i++){
            int num = (int)(str.charAt(i));
            answer += (char)(num + 49);
        }

        return answer;
    }
}