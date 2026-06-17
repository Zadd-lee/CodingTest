import java.lang.*;
import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            num1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            num2.add(nums2[i]);
        }
        HashSet<Integer> temp = new HashSet<>();
        temp.addAll(num1);
        temp.removeAll(num2);
        result.add(new ArrayList<>(temp));
        temp.clear();
        temp.addAll(num2);
        temp.removeAll(num1);
        result.add(new ArrayList<>(temp));


        return result;
    }
}