class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] strArr = s.split(" ");
        
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("Z")){
                answer -= Integer.parseInt(strArr[i-1]);
            }else{
                answer += Integer.parseInt(strArr[i]);
            }
            // System.out.println("i = " + i + ", s.charAt(i) = " + s.charAt(i) + ", answer =" + answer);
        }
        return answer;
    }
}