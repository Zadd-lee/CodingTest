import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] numbers, int target) {
        
        
        int cnt = 0;
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0,0});
        while(!stack.isEmpty()){
            int[] node = stack.pop();
            int depth = node[0];
            int hap = node[1];
            if(depth==numbers.length){
                if(node[1]==target) cnt++;
            }else{
                stack.push(new int[]{depth+1,hap+numbers[depth]});
                stack.push(new int[]{depth+1,hap-numbers[depth]});
            }
        }
        
        
        return cnt;
    }
}