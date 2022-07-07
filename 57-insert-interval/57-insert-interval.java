class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //define list
        List<int[]> list = new ArrayList<>();
        
        //1.add all intervals that are non-overlapping to the newInterval
        int i = 0, n = intervals.length;
        
        while(i < n && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i++]);
        }
        //2. merge newInterval with overlapping interval
        while(i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i++][1]);
            
        }
        list.add(newInterval);
        //3. add the remaining intervals onto the list
        while(i < n){
            list.add(intervals[i++]);
        }
        //return list
        return list.toArray(new int[list.size()][2]);
    }
}