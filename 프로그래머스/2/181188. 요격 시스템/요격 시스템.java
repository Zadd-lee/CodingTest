import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        int end = -1;
        
        Arrays.sort(targets,(int[]a,int[]b)->{
            return a[1]-b[1];
        });
        
        for(int[] target:targets){
            int start = target[0];
            int finish = target[1];
            if(start>=end){
                answer++;
                end = finish;
            }
        }
        
        return answer;
    }
}