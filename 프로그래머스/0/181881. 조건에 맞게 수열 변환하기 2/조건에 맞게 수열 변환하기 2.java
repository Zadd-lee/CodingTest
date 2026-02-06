import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr1=arr.clone();
        while(true){
            
            for(int i = 0;i<arr1.length;i++){
                if(arr1[i]>=50 && arr1[i]%2==0){
                    arr1[i]/=2;
                }else if(arr1[i]<50 && arr1[i]%2==1){
                    arr1[i]*=2;
                    arr1[i]++;
                }
            }
            answer++;
            
            if(Arrays.equals(arr,arr1)){
                break;
            }else{
                arr=arr1.clone();
            }

            
            
        }

            
        return answer-1;
    }
}