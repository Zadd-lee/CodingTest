import java.lang.*;
import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        /*
        * 1. (코드번호,제조일,최대수량,현재수량) , 기준, 기준 값보다 작은 값, 정렬 기준
        2. 정렬 결과
        3. 정렬
        4. 
        */
        List<int[]> d = new ArrayList<>(Arrays.asList(data));
        int ind = -1;
        switch (ext){
            case "code":
                ind = 0;
                break;
            case "date":
                ind = 1;
                break;
            case "maximum":
                ind = 2;
                break;
            case "remain":
                ind = 3;
                break;
        }
        int i=0;
        while(d.size()>i){
            if(d.get(i)[ind]>=val_ext){
                d.remove(i);
            }else{
                i++;
            }
        }
        switch (sort_by){
            case "code":
                d.sort((a,b)->Integer.compare(a[0],b[0]));
                break;
            case "date":
                d.sort((a,b)->Integer.compare(a[1],b[1]));
                break;
            case "maximum":
                d.sort((a,b)->Integer.compare(a[2],b[2]));
                break;
            case "remain":
                d.sort((a,b)->Integer.compare(a[3],b[3]));
                break;
        }
        
        
        
        return d;
    }
}