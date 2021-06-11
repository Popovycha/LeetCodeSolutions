class Solution { //Program to look a substring in the string 
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) //We are using regular method for a string search
            return 0;
        int m = haystack.length();
        int n = needle.length();
        if (m < n)
            return -1; //needle is not in haystack
        for (int i = 0; i <= m - n; ++i ) { //iteration from left to right 
            int j;
            for ( j = 0; j < n; ++j) { //comparison needle and haystack
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
            if (j == n) //if needle is found
                return i;
        }
        return -1; 
    }
}