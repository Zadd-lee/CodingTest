import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        int left = 1;
        int right = distance;
        
        Arrays.sort(rocks);
        
        while(left<=right){
            int mid = (left + right)/2;
            int removeCnt = 0;
            int prev = 0;
            
            
            for(int rock:rocks){
                if(rock-prev < mid){
                    removeCnt++;
                }else{
                    prev = rock;
                }
            }
            if(distance -prev < mid) removeCnt++;
            
            
            if(removeCnt>n){
                right = mid-1;
            }else{
                answer = mid;
                left = mid+1;
            }
        }
        return answer;
    }
}