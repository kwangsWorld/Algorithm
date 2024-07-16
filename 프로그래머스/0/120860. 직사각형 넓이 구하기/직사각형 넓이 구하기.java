class Solution {
    public int solution(int[][] dots) {
        // 초기값을 첫 번째 점의 좌표로 설정합니다.
        int xMin = dots[0][0], xMax = dots[0][0];
        int yMin = dots[0][1], yMax = dots[0][1];
        
        // 모든 점을 순회하면서 xMin, xMax, yMin, yMax 값을 갱신합니다.
        for(int i = 0; i < dots.length; i++){
            int x = dots[i][0];
            int y = dots[i][1];
            
            // x 좌표의 최소, 최대값 갱신
            if(x < xMin) xMin = x;
            if(x > xMax) xMax = x;
            
            // y 좌표의 최소, 최대값 갱신
            if(y < yMin) yMin = y;
            if(y > yMax) yMax = y;
            
            // 디버깅 출력
            System.out.println("점 (" + x + ", " + y + ")");
            System.out.println("xMin: " + xMin + ", xMax: " + xMax + ", yMin: " + yMin + ", yMax: " + yMax);
        }
        
        // 넓이를 계산합니다.
        int answer = (xMax - xMin) * (yMax - yMin);
        
        return answer;
    }
}