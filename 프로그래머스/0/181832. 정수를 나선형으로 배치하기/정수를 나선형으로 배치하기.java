class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int num = 1;
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        
        while(num <= n*n){
            
            //오른쪽 이동
            for(int j = left; j <= right && num <= n*n; j++){
                answer[top][j] = num++;
            }
            top++;
            
            //아래로 이동
            for(int i = top; i <= bottom && num <= n*n; i++){
                answer[i][right] = num++;
            }
            right--;
            
            //왼쪽으로 이동
            for(int j = right; j >= left && num <= n*n; j--){
                answer[bottom][j] = num++;
            }
            bottom--;
            
            //위쪽으로 이동
            for(int i = bottom; i >= top && num <= n*n; i--){
                answer[i][left] = num++;
            }
            left++;
            
        }
        
        
        return answer;
    }
}