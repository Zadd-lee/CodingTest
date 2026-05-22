import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> nq = new PriorityQueue<>();
        PriorityQueue<Integer> xq = new PriorityQueue<>(Collections.reverseOrder());
        for(String operation:operations){
            String[] o = operation.split(" ");
            if(o[0].equals("I")){
                nq.offer(Integer.parseInt(o[1]));
                xq.offer(Integer.parseInt(o[1]));
            }else{
                if(nq.isEmpty() || xq.isEmpty()) continue;
                if(o[1].equals("1")){
                    Integer max = xq.poll();
                    nq.remove(max);
                }else{
                    Integer min = nq.poll();
                    xq.remove(min);
                }
            }
            
        }
        
        int[] answer = new int[2];

        
        if(!nq.isEmpty()){
            answer[1]=nq.poll();
        }
        if(!xq.isEmpty()){
            answer[0]=xq.poll();
        }
        return answer;
    }
}