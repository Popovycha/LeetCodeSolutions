class Solution {

        private Map<Character,Integer> maps;
    
    public Solution(){
        // create a dictionary
        maps = new HashMap<>();
        maps.put('I', 1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L', 50);
        maps.put('C', 100);
        maps.put('D', 500);
        maps.put('M', 1000);
    }
    
    public int romanToInt(String s) {
        int last = 0;
        int total = 0;
        for(int i = s.length() - 1; i >= 0 ; i --){
            int current = maps.get(s.charAt(i));
            if(last > current){
               total-=current;   
            }else{
                total+=current;
            }
            last = current;  
        }
        return total;
    }
        
    
}