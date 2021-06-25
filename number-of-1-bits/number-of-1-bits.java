public class Solution {
    //Solution based in Brian Kernighan's Algorithm, jumps on only selective bits which are set (1)
    //What we are generally Doing here is finding out the right most set bit which is set i.e. is 1
    //which is calculated using "n & -n" and then we subtract this from temp so that the set bit will become non set now following by counting the set bit.
    //And we count till all the bits become 0 and at the end we return the counted set bits.
    public int hammingWeight(int n) {
        int count = 0;
        while(n !=0){
            long temp = n & n & -n;
            n -= temp;
            count++;
        }
        return count;
    }
}