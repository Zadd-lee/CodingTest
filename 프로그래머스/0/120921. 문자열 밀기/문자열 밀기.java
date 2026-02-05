class Solution {
    public int solution(String A, String B) {
        StringBuffer sb = new StringBuffer();
        
        if(A.equals(B)){
            return 0;
        }
        
        for(int i=0;i<A.length()-1;i++){
            sb.append(A.charAt(A.length()-1));
            sb.append(A);
            sb.setLength(A.length());
            A = sb.toString();
            sb.setLength(0);
            
            if(A.equals(B)){
                return 1+i;
            }
            
        }
        
        
        return -1;
    }
}