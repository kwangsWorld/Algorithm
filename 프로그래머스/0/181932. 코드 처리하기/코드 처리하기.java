class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int idx = 0; idx < code.length(); idx++){
            // System.out.println("code의 " + idx + "번째 인덱스 값은 " + code.charAt(idx));
            if(mode == 0){
                if(code.charAt(idx) == '1'){
                    mode = 1;
                }else if(idx % 2 == 0){
                    ret += code.charAt(idx);
                }
            }else{
                if(code.charAt(idx) == '1'){
                    mode = 0;
                }else if(idx % 2 == 1){
                    ret += code.charAt(idx);
                }
            }
            // System.out.println("현재 ret값은 " +  ret);
        }
        
        if(ret == ""){
            ret = "EMPTY";
        }
        
        return ret;
    }
}