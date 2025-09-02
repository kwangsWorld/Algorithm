class Solution {
    public String[] solution(String[] picture, int k) {
        // 최종적으로 줄 수는 picture.length * k
        String[] result = new String[picture.length * k];
        int idx = 0;

        for (String row : picture) {
            // 가로 확대
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < row.length(); i++) {
                char ch = row.charAt(i);
                for (int j = 0; j < k; j++) {
                    sb.append(ch);
                }
            }
            String expandedRow = sb.toString();

            // 세로 확대
            for (int v = 0; v < k; v++) {
                result[idx++] = expandedRow;
            }
        }

        return result;
    }
}