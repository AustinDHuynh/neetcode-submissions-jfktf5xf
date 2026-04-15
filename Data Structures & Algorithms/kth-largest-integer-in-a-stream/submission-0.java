class KthLargest {
    private int K;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.K = k;
        for(int i = 0; i < nums.length; i++){
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        if(minHeap.size() < K){
            minHeap.offer(val);
        } else if(val > minHeap.peek()){
            minHeap.offer(val);
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
