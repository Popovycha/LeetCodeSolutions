class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val counts = Array(26) { 0 }
        for (i in s.indices) {
            counts[s[i] - 'a']++
            counts[t[i] - 'a']--
        }
        
        if (counts.filter { it != 0 }.size > 0)
             return false

        return true
    }
}

        //val map = mutableMapOf<Char, Int>()

        // for(i in 0 until s.length) {
        //   map.put(s[i], map.getOrDefault(s[i], 0) + 1) //add one
        //   map.put(t[i], map.getOrDefault(t[i], 0) - 1) // reduce one
        // }

        // return (map.values.firstOrNull{it != 0} == null)