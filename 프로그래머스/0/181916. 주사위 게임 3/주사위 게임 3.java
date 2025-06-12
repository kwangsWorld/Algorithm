class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if(a == b && b == c && c == d){ //첫번째 경우의 수
            answer = a * 1111;
        }else if(a == b && a == c){
            answer = (int)Math.pow((10 * a) + d, 2); //두번째 경우의 수
        }else if(a == b && a == d){
            answer = (int)Math.pow((10 * a) + c, 2);
        }else if(a == c && a == d){
            answer = (int)Math.pow((10 * a) + b, 2);
        }else if(b == c && c == d){
            answer = (int)Math.pow((10 * b) + a, 2);
        }else if(a == b && c == d){
            answer = (a + c) * Math.abs(a - c); //세번째 경우의 수
        }else if(a == c && b == d){
            answer = (a + b) * Math.abs(a - b);
        }else if(a == d && b == c){
            answer = (a + b) * Math.abs(a - b);
        }else if(a == b && c != d){ 
            answer = c * d;
        }else if(a == c && b != d){ 
            answer = b * d;
        }else if(a == d && b != c){ 
            answer = b * c;
        }else if(b == c && a != d){ 
            answer = a * d;
        }else if(b == d && a != c){ 
            answer = a * c;
        }else if(c == d && a != b){ 
            answer = a * b;
        }else{
            answer = Math.min(Math.min(a, b), Math.min(c, d));
        }
        
        
        
        return answer;
    }
}