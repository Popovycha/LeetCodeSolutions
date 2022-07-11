class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap =new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1] - (a[0] * a[0] + a[1] * a[1])));
        for(int[] point: points) {
            //for every points we add to the heap
            maxHeap.add(point);
            if(maxHeap.size() > k) {
                //removing farthest away point
                maxHeap.remove();
            }
        }
        //define to return closest points
        int[][] result = new int[k][2];
        while(k-- > 0) {
            result[k] = maxHeap.remove();                                                    
        }
        
        return result;
    }
}