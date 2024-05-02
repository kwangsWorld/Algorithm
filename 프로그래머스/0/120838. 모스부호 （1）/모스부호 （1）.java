class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] letterMorse = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
        "...-",".--","-..-","-.--","--.."};
        char ch;
        for(int i = 0; i < letterMorse.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(letterMorse[i].equals(morse[j])){
                    // System.out.println("i: " + i + ", letterMorse: " + letterMorse[i] + 
                    //              "/ j: " + j + ", morse: " + morse[j]);
                    ch = (char)(j+97);
                    answer += ch;
                }
            }
        }
        
        return answer;
    }
}