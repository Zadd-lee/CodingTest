class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> occu = new HashMap<>();
        for(int a:arr){
            occu.put(a,occu.getOrDefault(a,0)+1);
        }
         HashSet<Integer> set = new HashSet<>();

        for (int freq : occu.values()) {
            if (!set.add(freq)) {
                return false;
            }
        }
        return true;
        
    }
}