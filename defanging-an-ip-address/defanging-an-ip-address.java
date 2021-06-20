class Solution {
    public String defangIPaddr(String address) {
        StringBuilder adrs = new StringBuilder(address);
        for (int i = 0; i < adrs.length(); i++)
            if (adrs.charAt(i) == '.'){
                adrs.insert(i, '[');
                adrs.insert(i + 2, ']');
                i += 2;
            }
        return adrs.toString();
    }
}