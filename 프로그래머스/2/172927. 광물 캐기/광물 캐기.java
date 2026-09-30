import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int pc = 0;
        for(int p:picks){
            pc+=p;
        }
        
        int[][] pt = new int[3][3];
        pt[0] = new int []{1,1,1};
        pt[1] = new int[] {5,1,1};
        pt[2] = new int[] {25,5,1};
        
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(b[0]==a[0]){
                return Integer.compare(b[1],a[1]);
            }else return Integer.compare(b[0],a[0]);
                           });
        for(int i = 0;i<minerals.length;i+=5){
            pc--;
            int[] en = new int[3];
            for(int j = i;j<i+5;j++){
                if(j>=minerals.length) break;
                if(minerals[j].startsWith("d")){
                    en[0]+=1;
                }else if(minerals[j].startsWith("i")){
                    en[1]+=1;
                }else{
                    en[2]+=1;
                }
            }
            pq.offer(en);
            if(pc<=0) break;
        }
        
        
        int answer = 0;
        
        
        while(!pq.isEmpty()){
            int[] min = pq.poll();
          for(int pick = 0;pick<3;pick++){
              if(picks[pick]==0) continue;
              answer+=min[0]*pt[pick][0];
              answer+=min[1]*pt[pick][1];
              answer+=min[2]*pt[pick][2];
              picks[pick]--;
              break;
          }
        }
        
        
        return answer;
    }
}