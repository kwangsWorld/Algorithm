class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strArr = binomial.split(" ");
        // for(String str : strArr){
        //     System.out.println(str);
        // }
        int pre = Integer.parseInt(strArr[0]);
        int post = Integer.parseInt(strArr[2]);
        
        if(strArr[1].equals("+")){
            answer = pre + post;
        }else if(strArr[1].equals("-")){
            answer = pre - post;
        }else{
            answer = pre * post;
        }
        
        return answer;
    }
}