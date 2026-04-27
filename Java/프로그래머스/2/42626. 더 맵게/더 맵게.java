import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> spq = new PriorityQueue<>();
        for(int s : scoville){
            spq.offer(s);
        }
        
        
        while(spq.peek()<K){
            if(spq.size()<2) return -1;
            answer++;
            int a = spq.poll();
            int b = spq.poll();
            spq.add(a+2*b);
        }
        
        
        return answer;
    }
}