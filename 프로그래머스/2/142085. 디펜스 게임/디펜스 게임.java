import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(a,b));
        
        int answer = 0;
        for(int e:enemy){
            pq.offer(e);
            if(pq.size()>k){
                n-=pq.poll();
            }
            if(n<0) break;
            answer++;
            
        }
        return answer;
    }
}   