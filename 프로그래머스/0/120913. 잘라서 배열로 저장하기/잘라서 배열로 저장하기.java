class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int)(Math.ceil((double)my_str.length() / n));
        System.out.println("length = " + length);
        String[] answer = new String[length];
        String str = "";
        int index = 0;
        for(int i = 0; i < my_str.length(); i++){
            str += my_str.charAt(i);
            // System.out.println(str);
            if(str.length() == n){
                answer[index] = str;
                index++;
                str = "";
            }else if(i == my_str.length() - 1){
                answer[index] = str;
            }
        }
        return answer;
    }
}