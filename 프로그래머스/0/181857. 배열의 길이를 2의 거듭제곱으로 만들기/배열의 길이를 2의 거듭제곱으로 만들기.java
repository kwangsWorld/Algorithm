class Solution {
    public int[] solution(int[] arr) {
        // 1. arr.length 이상인 가장 작은 2의 거듭제곱 크기 구하기
        int power = 0;
        while (Math.pow(2, power) < arr.length) {
            power++;
        }
        int length = (int)Math.pow(2, power);

        // 2. 새 배열 생성
        int[] answer = new int[length];

        // 3. 기존 값 복사 (남는 자리는 자동으로 0)
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        // 디버깅 출력
        System.out.println("power: " + power + " / length: " + length);

        return answer;
    }
}
