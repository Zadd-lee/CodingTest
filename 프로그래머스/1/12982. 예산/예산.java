import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        
        int left = 0;
        int right = d.length;
        while(left<=right){
            int mid = (left+right)/2;
            int hap = 0;
            for(int i=0;i<mid;i++ ){
                hap+=d[i];
            }
            if(hap>budget){
                right = mid-1;
            }else{
                left = mid+1;
                answer = mid;
            }
        }
        return answer;
    }
}