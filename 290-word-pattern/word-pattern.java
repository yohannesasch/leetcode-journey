import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {


        String[] words = s.split(" ");

        Map<Character, String>  patMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char temp = pattern.charAt(i);

            if (pattern.length() != words.length) {
                return false;
            }

            if (patMap.containsKey(temp) && !patMap.get(temp).equals(words[i])) {
                return false;
            }

            if (wordMap.containsKey(words[i]) && !wordMap.get(words[i]).equals(temp)) {
                return false;
            }

            patMap.put(temp, words[i]);
            wordMap.put(words[i],temp);
        }

        return true;
    }
}