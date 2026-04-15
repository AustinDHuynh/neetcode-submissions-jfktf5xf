class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stoneHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            stoneHeap.offer(stones[i]);
        }

        while(stoneHeap.size() > 1){
            int rock1 = stoneHeap.poll();
            int rock2 = stoneHeap.poll();
            if(rock1 != rock2){
                stoneHeap.offer(rock1 - rock2);
            }
        }
       
       stoneHeap.offer(0);
       return stoneHeap.peek();

    }
}
