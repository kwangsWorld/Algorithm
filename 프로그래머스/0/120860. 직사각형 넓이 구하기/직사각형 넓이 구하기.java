class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xMax = 0, xMin = 0, yMax = 0, yMin = 0;
        for(int i = 0; i < dots.length; i++){
            for(int j = 0; j < dots[i].length; j++){
                System.out.println("i값 : " + i + " / j값 : " + j +
                                     " / dot[i][j]의 값: " + dots[i][j]);
                if(i == 0 && j == 0){
                    xMin = dots[i][j]; 
                    xMax = dots[i][j];
                }
                if(i == 0 && j == 1){
                    yMin = dots[i][j];
                    yMax = dots[i][j];
                }
                if(j == 0){
                    if(xMin > dots[i][j]){
                        xMin = dots[i][j];
                    }
                    if(xMax < dots[i][j]){
                        xMax = dots[i][j];
                    }
                }
                if(j == 1){
                    if(yMin > dots[i][j]){
                        yMin = dots[i][j];
                    }
                    if(yMax < dots[i][j]){
                        yMax = dots[i][j];
                    }
                }
            }
        }// x, y값 끝
        answer = (xMax - xMin) * (yMax - yMin);
        
        return answer;
    }
}