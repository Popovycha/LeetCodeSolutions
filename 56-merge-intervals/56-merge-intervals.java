class Solution {
    public int[][] merge(int[][] intervals) {
         // If the given array is empty
       if(intervals.length <= 1) return intervals;
        
        // Sort the arrays given so we are able to compare the start and the end value much more effectively
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        // We make an output arraylist as we don't know the size of the array we will be returning at the end;
        List <int[]> output = new ArrayList<>();
        
        // CurrentInterval is the first interval, just to get the ball rolling
        int[] currentInterval = intervals[0];
        
        // Add it to the output
        output.add(currentInterval);
        
        // For each interval int the intervals array
        for(int[] interval : intervals){
            // Defining the start and the end of the current and the next interval
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            // If they overlap, just update the currentInterval that was inside the output arraylist with the max of the already present value VS the next end value
            if(currentEnd >= nextStart){
                currentInterval[1] = Math.max(currentEnd,  nextEnd);
            }
            else{
                // Else they don't overlap and we can just add them to the arraylist
                currentInterval = interval;
                output.add(currentInterval);
            }
        }
        // WE need to return an array so we convert our output arraylist to array by using the following functions
        return output.toArray(new int[output.size()][]);
    }
}