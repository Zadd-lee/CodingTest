import java.util.*;
import java.lang.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> ind = new LinkedList<>();
        for(int i = 0;i<progresses.length;i++){
            ind.offer(i);
        }
        while(!ind.isEmpty()){
            for(int i = 0;i<progresses.length;i++){
                progresses[i]+=speeds[i];
            }
            
            
            int inDay = 0;
            while(!ind.isEmpty()){
                if(progresses[ind.peek()]<100) break;
                ind.poll();
                inDay++;
            }
            if(inDay!=0) result.add(inDay);
        }
        
        
        return result;
    }
}