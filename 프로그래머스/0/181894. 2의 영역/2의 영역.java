class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count = 0;
        int firstIdx = 0;
        int lastIdx = 0;
        int answerIdx = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                count++;
                if(count == 1){
                    firstIdx = i;
                }else if(count > 1){
                    lastIdx = i;
                }
            }
        }
        
        int length = lastIdx - firstIdx + 1;
        
        if(count == 0){
            return new int[]{-1};
        }else if(count == 1){
            return new int[]{2};
        }else{
            answer = new int[length];
            // System.out.println("for문 들어가기전에 firstIdx:" + firstIdx + ", lastIdx: " + lastIdx);
            for(int i = firstIdx; i <= lastIdx; i++){
                answer[answerIdx] = arr[i];
                // System.out.println("현재 answerIdx는 : " + answerIdx + ", i값은: " + i + ", arr[" + i + "]" + " 값은: " + arr[i] + "입니다.");
                answerIdx++;
                
            }
        }
        
        
        return answer;
    }
}