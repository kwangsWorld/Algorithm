class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[i];
        }
        
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j = start; j <= end; j++){
                answer[j]++;
            }
        }
        return answer;
    }
}