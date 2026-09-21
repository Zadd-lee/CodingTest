import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int mw = 0;
        int mh = 0;
        for(int i = 0;i<sizes.length;i++){
            Arrays.sort(sizes[i]);
            mw = Math.max(mw,sizes[i][0]);
            mh = Math.max(mh,sizes[i][1]);
        }
        return mw*mh;
    }
}