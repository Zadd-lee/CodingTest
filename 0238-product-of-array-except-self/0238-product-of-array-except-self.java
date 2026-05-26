class Solution {
    public int[] productExceptSelf(int[] nums) {
        int all = 1;
        int zeroCnt = 0;
        for(int num:nums){
            if(num==0){
                zeroCnt++;
            }else{
                all*=num;
            }
        }

        int[] result = new int[nums.length];
        if(zeroCnt >=2) {
            return result;
            };

        for(int i= 0;i< result.length;i++){
            if(zeroCnt==1){
                if(nums[i]==0) result[i] = all;
            }else{
                result[i] = all/nums[i];
            }
        }

        return result;
    }
}