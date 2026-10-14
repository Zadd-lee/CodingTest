import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        Stack<int[]> s = new Stack<>();
        s.push(new int[]{0,0});
    
        while(!s.isEmpty()){
            int[] now = s.pop();
            int index = now[0];
            int hap = now[1];
            if(index==numbers.length && hap==target) answer++; 
            if(index>=numbers.length) continue;
            
            s.push(new int[]{index+1,hap+numbers[index]});
            s.push(new int[]{index+1,hap-numbers[index]});
            
        }
        return answer;
    }
}