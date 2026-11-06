import java.lang.*;
import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(stack.isEmpty() && c==')') return false;
            else if(c=='(') stack.add('(');
            else stack.pop();
        }
        
        return (stack.size()==0);
    }
}