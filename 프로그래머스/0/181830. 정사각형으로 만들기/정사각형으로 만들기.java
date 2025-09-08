class Solution {
    public int[][] solution(int[][] arr) {
        
        int row = arr.length;
        int column = arr[0].length;     
        
        if(row == column){
            int[][] answer = new int[row][column];
            for(int i = 0; i < row; i++){
                for(int j = 0; j < column; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }else if(row > column){
            int[][] answer = new int[row][row];
            for(int i = 0; i < row; i++){
                for(int j = 0; j < column; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }else{
             int[][] answer = new int[column][column];
             for(int i = 0; i < row; i++){
                for(int j = 0; j < column; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }
    }
}