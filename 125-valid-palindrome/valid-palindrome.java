class Solution {
    public boolean isPalindrome(String s) {
        String letter = s.toLowerCase().replaceAll("[^a-z0-9]","");
        
        for (int i = 0; i < letter.length()/2; i++) {
            if (letter.charAt(i)!=letter.charAt(letter.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}