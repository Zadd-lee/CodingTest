import java.lang.*;
import java.util.*;

class Solution {
    public int largestAltitude(int[] gain) {
        int[] alti = new int[gain.length+1];
        
        for(int i = 0;i<gain.length;i++){
            alti[i+1] = alti[i]+gain[i];
        }
        Arrays.sort(alti);
        return alti[alti.length-1];
    }
}