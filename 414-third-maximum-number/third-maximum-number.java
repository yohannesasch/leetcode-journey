import java.util.Arrays;


class Solution {

    public static int find(int[] sortedUnq) {
        if (sortedUnq.length < 3) {
            return  sortedUnq[sortedUnq.length - 1];
        } else {
            return sortedUnq[sortedUnq.length - 3];
        }
    }

    public int thirdMax(int[] nums) {

        
        int[] unqSort = Arrays.stream(nums)
                .distinct()
                .sorted()
                .toArray();
        
      return find(unqSort);
    }
}