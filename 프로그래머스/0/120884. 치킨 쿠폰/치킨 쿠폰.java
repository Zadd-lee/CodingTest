class Solution {
    public int solution(int chicken) {
        int answer = 0;
    
        while(chicken/10>=1){
            int chi = chicken /10;
            int coupon = chicken %10;
            
            chicken = coupon+chi;
            answer+=chi;
            
        }
        
        return answer;
    }
}