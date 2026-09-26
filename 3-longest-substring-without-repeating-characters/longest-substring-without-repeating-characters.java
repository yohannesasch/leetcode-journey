import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {



        int left = 0;
        int maxL = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;

            }

            set.add(current);
            maxL = Math.max(maxL, i - left + 1);



        }
        return maxL;
    }
}