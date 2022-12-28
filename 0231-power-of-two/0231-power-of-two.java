class Solution {
    public boolean isPowerOfTwo(int n) {
        // n should be greater than zero
        // & of n and n-1 should be zero
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0; 
        // n = 5, (101 & 100 = 100 - not a power of 2)
        // n = 8, (1000 & 0111 = 0000 - power of 2)          
    }
}