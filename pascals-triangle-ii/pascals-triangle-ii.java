class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> prev = Arrays.asList(1), result = new ArrayList();
        if(rowIndex == 0) return prev;
        
        for(int row = 1; row <= rowIndex; row++) {
            int prevSize = prev.size();
            result = new ArrayList(prevSize + 1);
            for(int i = 0; i < prevSize + 1; i++) {
                if(i == 0 || i == prev.size()) result.add(i, 1);
                else result.add(i, prev.get(i-1) + prev.get(i));
            }
            
            prev = result;
        }
        
        return result; 
    }
}