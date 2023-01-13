class Solution {
    //Complexity Time && Space (n + m) 
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1) {
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2) {
            if(set.contains(i)) {
                list.add(i);
                set.remove(i); //avoid to count again
            }
        }
        int [] ans = new int[list.size()];
        int j = 0;
        for(int i:list) {
            ans[j++] = i;
        }
        return ans;
    }
}