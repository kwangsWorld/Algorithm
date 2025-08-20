class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int[] arr = new int[num_str.length()];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = num_str.charAt(i) - '0';
            answer += arr[i];
        }
        
        
        return answer;
    }
}