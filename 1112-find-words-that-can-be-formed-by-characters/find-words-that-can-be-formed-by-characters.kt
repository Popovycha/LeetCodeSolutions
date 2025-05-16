class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var lengthSum = 0
        val charCounts = IntArray(26)

        for (c in chars) {
            //increment at index we in, to know what how much we have
            charCounts[c - 'a']++
        }

        for (word in words) {
            val tempCharCount = charCounts.copyOf()
            var validCharCount = 0
            //loop each char in specific word, to check if its valid
            for (c in word) {
                if (tempCharCount [c - 'a'] > 0) {
                    validCharCount++
                    //decrement tohe count that we not using again
                    tempCharCount[c - 'a']--
                }
            }
            if (validCharCount == word.length) {
                //all char in current word valid 
                lengthSum += word.length
            }
        }
        return lengthSum
    }
}