class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == alp.charAt(0)){
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        return new String(charArr);
    }
}