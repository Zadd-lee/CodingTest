class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] pe = new int[n+1];
        
        for(int i:lost){
            pe[i]--;
        }
        for(int i:reserve){
            pe[i]++;
        }
        for(int i=1;i<=n;i++){
            if(i-1>=0 && pe[i]==-1){
                if(pe[i-1]==1){
                    pe[i]++;
                    pe[i-1]--;
                }else if(i+1<=n&&pe[i+1]==1){
                    pe[i]++;
                    pe[i+1]--;
                }else{
                    answer--;
                }
            }
        }
        return answer;
    }
}