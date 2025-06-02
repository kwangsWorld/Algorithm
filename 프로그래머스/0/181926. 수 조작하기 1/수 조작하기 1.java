class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        // System.out.println("처음 n의 값: " + n);
        for(int i = 0; i < control.length(); i++){
            if(control.charAt(i) == 'w'){n++;}
            else if(control.charAt(i) == 's'){n--;}
            else if(control.charAt(i) == 'd'){n+=10;}
            else if(control.charAt(i) == 'a'){n-=10;}
            
            // System.out.println("i값 " + i + "일 때, charAt값 : " + control.charAt(i) + ",n의 값: " + n);
        }
        // System.out.println("마지막 n의 값: " + n);
        
        answer = n;
        
        return answer;
    }
}