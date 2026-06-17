class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> occu = new HashMap<>();
        for(int a:arr){
            occu.put(a,occu.getOrDefault(a,0)+1);
        }
        List<Integer> oc = new ArrayList<>(occu.values());
        Collections.sort(oc);
        for(int i=0;i<oc.size()-1;i++){
            if(oc.get(i).equals(oc.get(i+1))) return false;
        }
        return true;
        
    }
}