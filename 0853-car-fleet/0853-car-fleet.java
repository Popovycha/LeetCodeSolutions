class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // O(n log n) time | O(n) space
        if(position.length == 0)    return 0;
        if(position.length == 1)    return 1;
        
        // stack stores "time" for each car reaching to destination
        Stack<Double> stack = new Stack<>();
        int[][] combine = new int[position.length][2];
        
        // update combine[][]
        for(int i = 0; i < position.length; i++)
        {
            combine[i][0] = position[i];
            combine[i][1] = speed[i];
        }
        
        Arrays.sort(combine, (a,b) -> a[0] - b[0]);
        
        // right -> left because the rightmost car maintains the same speed anyways
        for(int i = position.length-1; i >= 0; i--)
        {
            // it means how much "time" it takes for the car at position i to reach to destination
            double time = (double) (target - combine[i][0]) / combine[i][1];
            
            // left car spends less time reaching to destination
            // so it will collide the car in front (They become the SAME car fleet)
            if(!stack.isEmpty() && time <= stack.peek())
                continue;
            else
                // it would never collide the car in front so car fleet size + 1.
                stack.push(time);
        }
        return stack.size();
    }
}