import java.util.*;
import java.lang.*;

class Solution {
    public String reverseVowels(String s) {
        char[] vowels = {'a','e','i','o','u'};
        List<Character> invow = new ArrayList<>();
        for(char c : s.toCharArray()){
            int cC = (int) c;
            for(char v : vowels){
                int vC = (int)v;
                if(vC==cC || vC+32 == cC || vC-32 == cC ){
                    invow.add(c);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        int ind =0;
        for(char c : s.toCharArray()){
            if(ind<invow.size() && c == invow.get(ind)){
                sb.append(invow.get(invow.size()-1-ind));
                ind++;
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}