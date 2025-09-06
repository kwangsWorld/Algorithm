class Solution {
   public int[][] solution(int n) {
        int[][] result = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;
        int max = n * n;

        while (num <= max) {
            // 왼쪽에서 오른쪽 (top row)
            for (int j = left; j <= right && num <= max; j++) {
                result[top][j] = num++;
            }
            top++;

            // 위에서 아래로 (right column)
            for (int i = top; i <= bottom && num <= max; i++) {
                result[i][right] = num++;
            }
            right--;

            // 오른쪽에서 왼쪽 (bottom row)
            for (int j = right; j >= left && num <= max; j--) {
                result[bottom][j] = num++;
            }
            bottom--;

            // 아래에서 위로 (left column)
            for (int i = bottom; i >= top && num <= max; i--) {
                result[i][left] = num++;
            }
            left++;
        }

        return result;
    }
}