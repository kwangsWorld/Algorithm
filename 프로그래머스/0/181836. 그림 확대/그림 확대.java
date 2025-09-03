class Solution {
    public String[] solution(String[] picture, int k) {
        int H = picture.length;          // 원본 행 수
        int W = picture[0].length();     // 원본 열 수
        String[] answer = new String[H * k]; // 확대된 결과 배열

        for (int i = 0; i < H * k; i++) {
            int row = i / k;             // 원본 그림의 행 인덱스
            StringBuilder sb = new StringBuilder(W * k);

            for (int j = 0; j < W; j++) {
                char c = picture[row].charAt(j);
                for (int l = 0; l < k; l++) {
                    sb.append(c);       // 문자를 가로로 k번 붙이기
                }
            }

            answer[i] = sb.toString();   // 완성된 문자열 넣기
        }
        return answer;
    }
}
