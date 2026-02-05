class Solution {
    public int solution(int[] common) {
        int a = common[0];
        int b = common[1];
        int c = common[2];
        int answer = 0;
        
    //등차/등비 확인
        if(b*2 == a+c){//등차
            int d = b-a;
            answer = common[common.length-1]+d;
        }else{
            int r = b/a;
            answer = common[common.length-1]*r;
            
        }
        
        
        return answer;
    }
}