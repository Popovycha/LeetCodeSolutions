class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();       
        for (int i : nums1) {
            Integer count = map.get(i);
            if (count == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++count);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            Integer count = map.get(i);
            if (count != null && count != 0) {
                map.put(i, --count);
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            arr[i] = list.get(i);
        } 
       return arr;
    }
}