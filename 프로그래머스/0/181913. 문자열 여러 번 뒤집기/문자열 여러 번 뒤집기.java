class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] chars = my_string.toCharArray();        
        int num1 = 0, num2 = 0;
        int numGap;
        char tempt = ' ';
        
        
        for(int i = 0; i < queries.length; i++){
            num1 = queries[i][0];
            num2 = queries[i][1];
            numGap = num2 - num1;
        
            // for(int j = 0; j < chars.length; j++){
            //     if(j == 0){
            //         System.out.print(i + "인덱스 배열 바꾸기전의 값:");
            //     }
            //     System.out.print(chars[j]);
            // }
            
            for(int j = 0; j <= numGap / 2; j++){
                
                tempt = chars[num1];
                chars[num1] = chars[num2];
                chars[num2] = tempt;
                num1++;
                num2--;
                
                // for(int k = 0; k < chars.length; k++){
                //     if(k == 0){
                //         System.out.print(" / " + j + " 번쨰 바꾼 후의 값: ");
                //     }
                //     System.out.print(chars[k]);
                //     if(k == chars.length - 1){
                //         System.out.println();
                //     }
                // }
            }
        }
        
        answer = new String(chars);
        return answer;
    }
}