class Solution {
    public int titleToNumber(String columnTitle) {
        int power = 0;
        int result = 0;
        // Loop in reverse and keep storing  intermediate
        // result for every substring from i to columnTitle.length()
        for(int i = columnTitle.length()-1; i >=0; i--) {
            char currentCharacter = columnTitle.charAt(i);
            
            // char -> A, ascii -> 65, index for ascii -> 1
            // char -> B, ascii -> 66, index for ascii -> 2,
         
            int asciiValueOfCurrentCharacter = (int)currentCharacter;
            int indexForAsciiValueOfCurrentCharacter = asciiValueOfCurrentCharacter-65+1;
            
            // Need to multiply indexForAsciiValueOfCurrentCharacter with 26^(columnTitle.length()-1-i)
            // We get the intermediate result for substring i..columnTitle.length()
            int substringLengthToThePowerOf26 = (int)Math.pow(26, power++);
            int intermediateResultTillNow = substringLengthToThePowerOf26*indexForAsciiValueOfCurrentCharacter;
            
            // Final result is constructed
            result = result + intermediateResultTillNow;
        }
        return result;
        
    }
}