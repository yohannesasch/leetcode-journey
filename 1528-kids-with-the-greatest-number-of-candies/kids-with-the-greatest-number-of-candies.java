import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int maxCandies = 0;

        for (int num : candies) {
            if (num > maxCandies) {
                maxCandies = num;
            }
        }

        for (int num : candies) {
            result.add( num + extraCandies >= maxCandies);
        }

        return result;

    }
}