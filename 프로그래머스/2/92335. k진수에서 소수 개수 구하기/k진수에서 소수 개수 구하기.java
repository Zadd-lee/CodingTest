class Solution {
    public int solution(int n, int k) {
        String s = Integer.toString(n,k);
        String[] pA = s.split("0");

        int answer = 0;
        
        for(String p:pA){
            if(p.isBlank()) continue;
            System.out.println(p);
            if(isPrime(Long.parseLong(p))) answer++;
        }
        return answer;
    }
    private boolean isPrime(Long n){
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
    return true;
    }
}