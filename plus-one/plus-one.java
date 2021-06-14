class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n -1; i >=0; i--) { //goint thru loop backwards 
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int [] new_number = new int[n+1]; //if [9,9,9] will come up as new num [1.0.0.0]
        new_number[0]=1;
        return new_number;
    }
}