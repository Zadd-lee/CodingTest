import java.util.*;
import java.lang.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int c1 =0;
        int c2 = 0;
        int c3 = 0;
        for(int i = 0;i<answers.length;i++){
            if(su1[i%5]==answers[i]) c1++;
            if(su2[i%8]==answers[i]) c2++;
            if(su3[i%10]==answers[i]) c3++;
        }
        int max = Math.max(c1,Math.max(c2,c3));
        if(c1==max) answer.add(1);
        if(c2 == max) answer.add(2);
        if(c3 == max) answer.add(3);
        
        
        
        return answer;
    }
}