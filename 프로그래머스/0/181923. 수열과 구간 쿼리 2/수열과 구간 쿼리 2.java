class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        int s = 0, e = 0, k = 0;

        
        for(int i = 0; i < queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];
            int min = Integer.MAX_VALUE;
            
            for(int j = s; j <= e; j++){
                if(arr[j] > k && arr[j] < min){
                    min = arr[j];
                }
            }
            if(min != Integer.MAX_VALUE){
                answer[i] = min;
            }else{
                answer[i] = -1;
            }
        }

        return answer;
    }
}