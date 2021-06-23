class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder sc = new StringBuilder();
        while(columnNumber > 0){
            
            int title = columnNumber % 26;
            columnNumber /= 26;
            if(title > 0) {
                //Handle cases from "A" to "Y"
                title += 'A' - 1;
            } else {
                title ='Z'; //If input is 26 or 52 title will be 0 and cn 1 or 2
                columnNumber--;
            }
            sc.append((char)title);
        }
        return sc.reverse().toString();
        
    }
}