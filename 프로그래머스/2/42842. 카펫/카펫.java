class Solution {
    public int[] solution(int brown, int yellow) {
        
        int kan = brown+yellow;
        for(int w = kan/2;w>1;w--){
            if(kan%w!=0) continue;
            int h = kan/w;
            if((w-2)*(h-2)==yellow) return new int[]{w,h};
        }
        
        int[] answer = {};
        return answer;
    }
}