class Solution {
    public String longestCommonPrefix(String[] strs) {


        if (strs == null || strs.length == 0) {
            return "";
        }
        
        int minLength = strs[0].length();
        String minString = strs[0];

        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
                minString = str;
            }
        }

        for (int i = 0; i < strs.length; i++) {
            
            if (strs[i].equals(minString)) {
                continue;
            }

            for (int j = 0; j < minLength; j++) {
                if (strs[i].charAt(j) != minString.charAt(j)) {
                    minLength = j;
                    break;
                }
            }
        }
        return minString.substring(0, minLength);
    }
}