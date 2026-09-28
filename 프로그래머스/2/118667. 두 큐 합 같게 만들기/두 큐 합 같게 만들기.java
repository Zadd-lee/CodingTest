import java.lang.*;
import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        long sum1 = 0L;
        long sum2 = 0L;
        
        
        for(int i = 0;i<queue1.length;i++){
            sum1+=queue1[i];
            sum2+=queue2[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }
        
        if((sum1+sum2)%2!=0) return -1;
        long goal =(sum1+sum2)/2;
        
        int answer = 0;
        int limit = (queue1.length+queue2.length)*4;
        while(limit-->0){
            if(sum1==goal) return answer;
            if(sum1>sum2){
                int p = q1.poll();
                sum1-=p;
                sum2+=p;
                q2.offer(p);
            }else{
                int p = q2.poll();
                sum1+=p;
                sum2-=p;
                q1.offer(p);
            }
            answer+=1;   
        }
        return -1;
    }
}