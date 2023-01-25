class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        //priority bigger in the beginning b - a
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        //entry into pq
        for (Map.Entry entry : map.entrySet()) {
            pq.add(entry);
        }
        int result[] = new int[k];
        for (int i = 0; i<k; i++) {
            result[i] = pq.poll().getKey();
            //poll is pulling the first elem
        }
        return result;
    }
}