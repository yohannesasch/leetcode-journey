import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        Arrays.sort(score);

        String[] rank = new String[score.length];

        for (int i = score.length -1; i >= 0; i--) {

            if (i == score.length - 1 ) {
                rank[map.get(score[i])] = "Gold Medal";
            } else if ( i == score.length - 2) {
                rank[map.get(score[i])] = "Silver Medal";
            } else if (i == score.length - 3) {
                rank[map.get(score[i])] = "Bronze Medal";
            } else {
                rank[map.get(score[i])] = String.valueOf(score.length - i);
            }
        }

        return rank;
    }
}