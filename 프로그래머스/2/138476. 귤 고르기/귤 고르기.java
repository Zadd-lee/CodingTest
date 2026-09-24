import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] tcnt = new int[tangerine[tangerine.length-1]+1];
        for(int t:tangerine){
            tcnt[t]+=1;
        }
        
        Arrays.sort(tcnt);
        for(int i = tcnt.length-1;i>=0;i--){
            if(tcnt[i]<k){
                k=k-tcnt[i];
            }else{
                answer=tcnt.length-i;
                break;
            }
        }
            
        return answer;
    }
}