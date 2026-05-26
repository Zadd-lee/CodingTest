import java.util.*;
import java.lang.*;

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        
        List<Integer> result = new ArrayList<>();
        int zeroCnt = 0;
        for(int num:nums){
            if(num==0) {
                zeroCnt++;
            }else{
                result.add(num);
            }
        }
        while(zeroCnt-->0){
            result.add(0);
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = result.get(i);
        }
    }
}