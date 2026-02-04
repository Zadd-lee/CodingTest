import java.lang.*;
class Solution {
    public String solution(String bin1, String bin2) {
        StringBuffer sb = new StringBuffer();
        
        int b= binToTen(bin1)+ binToTen(bin2);
        
        while(b/2>0){
            sb.append(b%2);
            b/=2;
        }
        sb.append(b%2);
        sb.reverse();
        
        return sb.toString();
    }
    
    
    int binToTen(String bin){       
        int b = 0;
        
        for(int i=0;i<bin.length();i++){
            char t = bin.charAt(bin.length()-i-1);
            if(t=='1'){
                b+=Math.pow(2,i);
            }
        }
        return b;
    }

}