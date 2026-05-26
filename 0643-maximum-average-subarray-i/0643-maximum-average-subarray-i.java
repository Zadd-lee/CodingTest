import java.util.*;
import java.lang.*;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
        for(int i = 0;i<=nums.length-k;i++){
            int hap = 0;
            for(int j = i;j<i+k;j++){
                hap+=nums[j];
            }
            result = Math.max(result,hap);
        }
        return result/k;
    }
}