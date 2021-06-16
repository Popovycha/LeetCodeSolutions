class Solution {
    public int mySqrt(int x) {
        if(x <= 1)
            return x;
        //Binary Search O(log(x))
        int start = 1;
        int end = x /2;
        int mid;
       // x / 2 because the square root of any number will be less than half of the number(except number 2)
        while(start <= end) {
            mid = (start + end) >> 1; //same as (start + end) / 2, but using bitwise it makes the execution little bit faster
            if(mid == x / mid)
                return mid;
            
            if(mid > x / mid)
                end = mid -1;
            else 
                start = mid + 1;
        }
        return start - 1;
    }
}