class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a_point = 0;
        int b_point = numbers.length -1;
        
        while (a_point <= b_point) {
            int sum = numbers[a_point] + numbers[b_point];
            
            if (sum > target) {
                b_point -= 1;
            } else if (sum < target) {
                a_point += 1;
            } else {
                return new int[] {a_point+1, b_point+1};
            }
        }
        return new int[] {a_point+1, b_point+1};
    }
}