class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        int before = 0;
        int tempt = 0;
        int after = 0;
        
        for(int i = 0; i < queries.length; i++){
            for(int j = 0; j < queries[0].length; j++){
                if(j == 0){
                    before = queries[i][j];
                }else{
                    after = queries[i][j];
                }      
            }
            tempt = arr[before];
            arr[before] = arr[after];
            arr[after] = tempt;
        }
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}