class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int left = Integer.MAX_VALUE;
        int right = 1;
        for(int d:diffs){
            right = Math.max(right,d);
            left = Math.min(left,d);
        }
        
        while(left<=right){
            int mid = (left+right)/2;
            long time = 0;
            for(int i = 0;i<diffs.length;i++){                
                if(diffs[i]<=mid){
                    time+=times[i];
                }else{
                    if(i == 0){
                        time+=times[i];
                    }else{
                        time += (diffs[i]-mid)*(times[i-1]+times[i]);
                        time += times[i];
                    }
                }
                if(time>limit) break;
            }

            if(time<=limit){
                answer = mid;
                right = mid -1;
            }else{
                left = mid+1;
            }
            
            
        }
        
        
        
        return answer;
    }
}