import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastNum1 = m-1;
        int lastNum2 = n-1;
        int merge = m+n-1;
        while (lastNum1>=0 && lastNum2>=0) {
            if (nums1[lastNum1] > nums2[lastNum2]) {
                nums1[merge] = nums1[lastNum1];
                lastNum1--;
            } else {
                nums1[merge] = nums2[lastNum2];
                lastNum2--;
            }
            merge--;
        }

        while (lastNum2>=0) {
            nums1[merge] = nums2[lastNum2];
            lastNum2--;
            merge--;
        }
    }
}