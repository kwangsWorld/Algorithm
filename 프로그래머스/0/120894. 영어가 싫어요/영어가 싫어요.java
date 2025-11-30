class Solution {
    public long solution(String numbers) {
        String answer = "";
        
            while(true){
                if(numbers.charAt(0) == 'o'){
                    answer += "1";
                    numbers = numbers.substring(3);
                }else if(numbers.charAt(0) == 't'){
                    if((numbers.substring(0,5)).equals("three")){
                        answer += "3";
                        numbers = numbers.substring(5);
                    }else{
                        answer += "2";
                        numbers = numbers.substring(3);
                    }
                }else if(numbers.charAt(0) == 'f'){
                    if(numbers.substring(0,4).equals("four")){
                        answer += "4";
                        numbers = numbers.substring(4);
                    }else{
                        answer += "5";
                        numbers = numbers.substring(4);
                    }
                }else if(numbers.charAt(0) == 's'){
                    if(numbers.substring(0,3).equals("six")){
                        answer += "6";
                        numbers = numbers.substring(3);
                    }else{
                        answer += "7";
                        numbers = numbers.substring(5);
                    }
                }else if(numbers.charAt(0) == 'e'){
                    answer += "8";
                    numbers = numbers.substring(5);
                }else if(numbers.charAt(0) == 'n'){
                    answer += "9";
                    numbers = numbers.substring(4);
                }else{
                    answer+= "0";
                    numbers = numbers.substring(4);
                }
                
                if(numbers.equals("")){
                    break;
                }

            }
        
        return Long.parseLong(answer);
    }
}