class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for(String word : wordDict) {
            set.add(word);
        }
        
        int n = s.length();
        boolean[] dp = new boolean[n];
        //brute force all-substrings and perform check w dictionary
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                String word = s.substring(j, i+1);
                if(set.contains(word)) {
                    if(j== 0 || dp[j-1]) {
                        dp[i] =true;
                    }
                }
            }
        }
        
        return dp[n-1];
    }
}