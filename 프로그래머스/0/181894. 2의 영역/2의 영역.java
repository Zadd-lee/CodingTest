class Solution {
    public int[] solution(int[] arr) {
                int fInd = -1;
        int lInd = -1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2 && fInd == -1){
                fInd = i;
            }else if(arr[i]==2){
                lInd = i;
            }
        }
        if(fInd == lInd && fInd == -1){
            return new int[]{-1};
        }else if( lInd==-1){
            return new int[]{2};
        }else{
            int[] rs = new int[lInd-fInd+1];
            for(int i=0;i<rs.length;i++){
                rs[i]=arr[fInd+i];
            }
            return rs;
              
        }
        
    }
}