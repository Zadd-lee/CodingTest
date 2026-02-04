class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int a = 0;a<queries.length;a++){
            int s =queries[a][0];
            int e = queries[a][1];
            for(int i=s;i<=e;i++){
                arr[i]+=1;
            }
        }
        return arr;
    }
}