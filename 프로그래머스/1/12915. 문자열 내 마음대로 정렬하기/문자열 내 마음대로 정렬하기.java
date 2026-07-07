import java.lang.*;
import java.util.*;


class Solution {
    public String[] solution(String[] strings, int n) {
        //1. 입력 문자열, 정수
        //2. 출력 : 문자열
        //3. 로직 : 문자열의 특정 인덱스 기준으로 정렬하기
        //4. 같은 문자인 경우 사전순으로 정렬
        
        Arrays.sort(strings,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n)==s2.charAt(n)) return s1.compareTo(s2);
                else{
                    return s1.charAt(n)-s2.charAt(n);
                }
            }
        });
        
        return strings;
    }
}