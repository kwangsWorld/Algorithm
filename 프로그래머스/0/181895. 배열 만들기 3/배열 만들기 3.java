class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int length = (intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1);
        int[] answer = new int[length];
        int index = 0;
        
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                answer[index] = arr[j];
                index++;
            }
        }
        return answer;
    }
}