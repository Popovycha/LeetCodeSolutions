public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        //treat n as an unsigned value
        int bitCount = 0;
        int ans = 0xffffffff;
        while (bitCount < 32) {
            if ( (n & 1) != 0) {
                // do nothing
            } else {
                // set to 0
                ans &= ~( 1<< 31-bitCount) ;
            }
            n =  n>>1;
            bitCount ++;
        }
        return ans;
    }
}