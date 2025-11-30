class Solution {
    public long solution(String numbers) {
        String answer = "";
        for(int i = 0; i < numbers.length();){
            if(numbers.charAt(i) == 'o'){
                answer += '1';
                i += 3;
            }else if(numbers.charAt(i) == 't'){
                if(numbers.charAt(i+1) == 'w'){
                    answer += '2';
                    i += 3;
                }else{
                    answer += '3';
                    i += 5;
                }
            }else if(numbers.charAt(i) == 'f'){
                if(numbers.charAt(i+1) == 'o'){
                    answer += '4';
                    i += 4;
                }else{
                    answer += '5';
                    i += 4;
                }
            }else if(numbers.charAt(i)== 's'){
                if(numbers.charAt(i+1) == 'i'){
                    answer += '6';
                    i += 3;
                }else{
                    answer += '7';
                    i += 5;
                }
            }else if(numbers.charAt(i) == 'e'){
                answer += '8';
                i += 5;
            }else if(numbers.charAt(i) == 'n'){
                answer += '9';
                i += 4;
            }else{
                answer += '0';
                i += 4;
            }
        }
        return Long.parseLong(answer);
    }
}