class Solution {
    public int solution(String dartResult) {
        /*
        1. 점수|보너스|[옵션] string
        2. 점수
        3. 구현
        4. 옵션
        */
        int answer=0;
        StringBuffer sb = new StringBuffer();
        int[] dart = new int[3];
        int ind = 0;
        for(int i = 0;i<dartResult.length();i++){
            switch(dartResult.charAt(i)){
                case 'S':
                    dart[ind] = Integer.parseInt(sb.toString());
                    ind++;
                    sb.setLength(0);
                    break;
                case 'D':
                    dart[ind] = Integer.parseInt(sb.toString())*Integer.parseInt(sb.toString());
                    ind++;
                    sb.setLength(0);
                    break;
                case 'T':
                    dart[ind] = Integer.parseInt(sb.toString())*Integer.parseInt(sb.toString())*Integer.parseInt(sb.toString());
                    ind++;
                    sb.setLength(0);
                    break;
                case '*':
                    if(ind==1){
                        dart[ind-1]*=2;
                    }else{
                        dart[ind-2]*=2;
                        dart[ind-1]*=2;
                    }
                    break;
                case '#':
                    dart[ind-1]*=-1;
                    break;
                default:
                    sb.append(dartResult.charAt(i));
            }
            
        }
        
        
        
        for(int j = 0;j<3;j++){
            System.out.println(dart[j]);
            answer+=dart[j];
        }
        
        
        return answer;
    }
}