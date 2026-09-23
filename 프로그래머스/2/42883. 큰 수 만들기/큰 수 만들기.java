import java.lang.*;
import java.util.*;


class Solution {
    public String solution(String number, int k) {
        Stack <Character> s = new Stack<>(); 
        s.push(number.charAt(0));
        for(int i = 1;i<number.length();i++){
            while(k>=1 && !s.isEmpty() &&s.peek()-'0'<number.charAt(i)-'0'){
                s.pop();
                k--;
            }
            s.push(number.charAt(i));
        }
        
        String answer = "";
        for(char ss:s){
            answer+=ss;
        }
        if(k>0){
            answer = answer.substring(0,answer.length()-k);
        }
        return answer;
    }
}