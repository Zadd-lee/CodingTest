class RecentCounter {
    private int time;
    private Queue<Integer> q;

    public RecentCounter() {
        this.time=0;
        q=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.add(t);
        for(Integer a:q){
            if(a<t-3000){
                q.remove();
            }else{
                break;
            }
        }
        
        return q.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */