import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            int number = (int)str.charAt(i);
            // System.out.print("형변환 전 number = " + number);
            if(number >= 65 && number <= 90){
                number += 32;
            }else{
                number -= 32;
            }
            // System.out.println("/ 형변환 후 number = " + number);
            System.out.print((char)number);
        }
    }
}