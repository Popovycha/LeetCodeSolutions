class TimeMap {
    //Time: set - O(1), get - log(N)
    //Space: set - O(N), get - O(1)
    
    //create data structure
    private Map <String, List<Data>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)){
            map.put(key, new ArrayList<>());         
        } 
        //add timestamp and value to the arr
        map.get(key).add(new Data(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        //check if exist
        if (!map.containsKey(key)){ 
        return "";
        }
        //Extract list
        List<Data> data = map.get(key);
        return findClosestValue(data, timestamp);
    }
    
    //Binary Search
    private String findClosestValue(List<Data> data,int timestamp) {
        //searchin for closest timestamp given to us
        int left = 0;
        int right = data.size() - 1;
        
        while(left < right) {
            int mid = (left + right + 1) / 2;
            if(data.get(mid).timestamp <= timestamp) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        Data closestData = data.get(left);
        //closest data timestamp can be still greater for a given one, to handle that 
        return closestData.timestamp > timestamp ? "" : closestData.value;
    }
    
    class Data {
        String value;
        int timestamp;
        public Data(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */