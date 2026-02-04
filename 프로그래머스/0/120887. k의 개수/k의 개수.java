class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int a = i;a<=j;a++){
            String as = Integer.toString(a);
            for(int b = 0;b<as.length();b++){
                if(as.charAt(b)==Character.forDigit(k , 10)){
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}