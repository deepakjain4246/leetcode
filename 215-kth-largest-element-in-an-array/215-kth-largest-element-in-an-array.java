class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new  PriorityQueue<Integer>();
        int count =0;
        for(int i = 0;i<nums.length;i++) {
              if(pq.size() < k) {
                    pq.add(nums[i]);
                   count++;
            }
        }
        for(int j = count;j<nums.length;j++) {
            if(nums[j]>pq.peek()) {
                pq.poll();
                pq.add(nums[j]);
            }
        }
        
        return pq.peek();
        
    }
}