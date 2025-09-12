class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int coefficient = 0;
        int constant = 0;
        
        String[] strArr = polynomial.split(" \\+ ");
        
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("x")){
                coefficient += 1;
            }else if(strArr[i].contains("x")){
                coefficient += Integer.parseInt(strArr[i].substring(0,strArr[i].indexOf("x")));
            }else{
                constant += Integer.parseInt(strArr[i]);
            }
        }
        
        if(constant == 0){
            if(coefficient == 0){
                answer = "0";
            }else if(coefficient == 1){
                answer = "x";
            }else{
                answer = coefficient + "x";
            }
        }else{
            if(coefficient == 0){
                answer = String.valueOf(constant);
            }
            else if(coefficient == 1){
                answer = "x + " + constant;
            }else{
                answer = coefficient + "x + " + constant;
            }
        }
        
        return answer;
    }
}